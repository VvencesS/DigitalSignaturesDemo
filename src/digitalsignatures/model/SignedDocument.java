package digitalsignatures.model;

public class SignedDocument {
    private int id;
    private int document;
    private String signate;

    public SignedDocument() {
    }

    public SignedDocument(int document, String signate) {
        this.document = document;
        this.signate = signate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getSignate() {
        return signate;
    }

    public void setSignate(String signate) {
        this.signate = signate;
    }
}
