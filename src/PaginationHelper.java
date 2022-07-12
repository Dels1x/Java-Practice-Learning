import java.util.List;

public class PaginationHelper<I> {
    final List<I> items;
    final int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage2) {
        items = collection;
        itemsPerPage = itemsPerPage2;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return items.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil((double) itemCount() / itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if(pageIndex > pageCount()-1 || pageIndex < 0) return -1;
        if(pageIndex < pageCount()-1) return itemsPerPage;
        int count = itemCount();
        for(int i = 0; i < pageIndex; i++) {
            count -= itemsPerPage;
        }
        return count;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        System.out.println(itemIndex);
        System.out.println(itemCount());
        System.out.println(itemsPerPage);
        if (itemIndex > itemCount() || itemIndex < 0 || itemCount() == 0) return -1;
        int count = -1;
        for(int i = -1; i < itemIndex; i+=itemsPerPage) count++;
        return count;
    }
}
