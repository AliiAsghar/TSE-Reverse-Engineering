package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rnx extends aglo {
    public static final String[] a = {"parts_backup._id", "parts_backup.message_id", "parts_backup.content_type", "parts_backup.source", "parts_backup.text", "parts_backup.width", "parts_backup.height", "parts_backup.longitude", "parts_backup.latitude", "parts_backup.cms_full_size_blob_id", "parts_backup.cms_media_encryption_key", "parts_backup.cms_compressed_media_encryption_key", "parts_backup.cms_compressed_blob_id", "parts_backup.file_name"};
    public static final alor b;
    public static final int[] c;
    public static final int[] d;
    public static final yzk e;

    static {
        alok alokVar = new alok();
        alokVar.h("parts_backup.message_id", 0);
        alokVar.h("parts_backup.content_type", 0);
        alokVar.h("parts_backup.source", 10);
        alokVar.h("parts_backup.text", 0);
        alokVar.h("parts_backup.width", 0);
        alokVar.h("parts_backup.height", 0);
        alokVar.h("parts_backup.longitude", 0);
        alokVar.h("parts_backup.latitude", 0);
        alokVar.h("parts_backup.cms_full_size_blob_id", 0);
        alokVar.h("parts_backup.cms_media_encryption_key", 0);
        alokVar.h("parts_backup.cms_compressed_media_encryption_key", 0);
        alokVar.h("parts_backup.cms_compressed_blob_id", 0);
        alokVar.h("parts_backup.file_name", 100);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("message_id", "index_parts_backup_message_id");
        alokVar2.b();
        e = new yzk();
        c = new int[]{0, 10, 100};
        d = new int[]{90};
    }

    public static final rnv a() {
        String[] strArr;
        Integer b2 = b();
        if (b2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("parts_backup._id");
            if (b2.intValue() >= 0) {
                alobVar.h("parts_backup.message_id");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("parts_backup.content_type");
            }
            if (b2.intValue() >= 10) {
                alobVar.h("parts_backup.source");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("parts_backup.text");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("parts_backup.width");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("parts_backup.height");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("parts_backup.longitude");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("parts_backup.latitude");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("parts_backup.cms_full_size_blob_id");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("parts_backup.cms_media_encryption_key");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("parts_backup.cms_compressed_media_encryption_key");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("parts_backup.cms_compressed_blob_id");
            }
            if (b2.intValue() >= 100) {
                alobVar.h("parts_backup.file_name");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new rnv(strArr);
    }

    public static Integer b() {
        agcp W;
        W = agnc.d("backup").W();
        return Integer.valueOf(W.c());
    }

    public static String c(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INT REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("content_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("source INT DEFAULT(13)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("width INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("height INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("longitude REAL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("latitude REAL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_full_size_blob_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_media_encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_compressed_media_encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_compressed_blob_id TEXT");
        if (i >= 100) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_name TEXT");
        }
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static String[] d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_parts_backup_message_id");
        arrayList.add("CREATE INDEX index_parts_backup_message_id ON parts_backup(message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
