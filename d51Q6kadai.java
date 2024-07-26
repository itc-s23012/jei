// s23012
// 小分類名に加工肉を追加

public class d51Q6kadai {
    public static void main(String[] args) {
        // Define major and minor item categories
        Item[] majorItems = { new Item("AA", "魚類"), new Item("BB", "肉類") };
        Item[] minorItems = { new Item("A1", "さば"), new Item("A2", "さんま"),
                new Item("B1", "牛肉"), new Item("B2", "鶏肉"),
                new Item("B3", "豚肉"), new Item("B4", "加工肉") };
        
        // Create item master object
        ItemMaster itemMaster = new ItemMaster(majorItems, minorItems);
        
        // Extract parts of the item code
        String itemCode = args[0];
        String majorCode = itemCode.substring(0, 2);
        String minorCode = itemCode.substring(2, 4);
        String detailCode = itemCode.substring(4);
        
        // Get names for the codes
        String majorName = itemMaster.getItemName(ItemMaster.MAJOR, majorCode);
        String minorName = itemMaster.getItemName(ItemMaster.MINOR, minorCode);
        
        // Print results
        System.out.println("商品コード：" + itemCode);
        System.out.println("大分類名：" + majorName);
        System.out.println("小分類名：" + minorName);
        System.out.println("詳細コード：" + detailCode);
    }
}

class Item {
    private String code;
    private String name;

    public Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

class ItemMaster {
    public static final int MAJOR = 0;
    public static final int MINOR = 1;
    private Item[][] items;

    public ItemMaster(Item[] majorItems, Item[] minorItems) {
        items = new Item[2][];
        items[MAJOR] = majorItems;
        items[MINOR] = minorItems;
    }

    public String getItemName(int category, String code) {
        for (Item item : items[category]) {
            if (item.getCode().equals(code)) {
                return item.getName();
            }
        }
        return "(不明)";
    }
}

