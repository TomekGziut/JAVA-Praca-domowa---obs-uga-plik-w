import java.io.IOException;

abstract class AbstractBook {
    protected String filePath;

    public AbstractBook(String filePath) {
        this.filePath = filePath;
    }

    public abstract String page(int pageNumber) throws IOException;
}
