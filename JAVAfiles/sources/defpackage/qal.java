package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qal extends aglo {
    public static final String[] a = {"file_processing.processing_id", "file_processing.file_type", "file_processing.file_uri", "file_processing.content_type", "file_processing.encryption_metadata", "file_processing.transfer_handle", "file_processing.upload_result"};
    public static final int[] b;
    public static final qxr c;

    static {
        new alok().b();
        new alok().b();
        c = new qxr();
        b = new int[]{60260};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("processing_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("file_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("file_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("content_type BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("encryption_metadata BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("transfer_handle TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("upload_result BLOB");
        sb.insert(0, "CREATE TABLE file_processing (");
        sb.append(", PRIMARY KEY (processing_id,file_type));");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }

    public static sdz b() {
        int i = qaa.a;
        return new sdz(null);
    }
}
