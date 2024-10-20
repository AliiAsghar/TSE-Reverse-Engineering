package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xpf extends aglo {
    public static final String[] a = {"file_transfer.message_id", "file_transfer.transfer_id", "file_transfer.transfer_type", "file_transfer.attachment_upload_response", "file_transfer.file_information", "file_transfer.thumbnail_information", "file_transfer.transfer_handle", "file_transfer.opaque_data"};
    public static final alor b;
    public static final int[] c;
    public static final ahmv d;

    static {
        alok alokVar = new alok();
        alokVar.h("file_transfer.file_information", 55030);
        alokVar.h("file_transfer.thumbnail_information", 59910);
        alokVar.h("file_transfer.transfer_handle", 55030);
        alokVar.h("file_transfer.opaque_data", 56040);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("transfer_id", "index_file_transfer_transfer_id");
        alokVar2.b();
        d = new ahmv();
        c = new int[]{52060, 55030, 56040, 58450, 59910};
    }

    public static xow a(MessageIdType messageIdType) {
        xpc c2 = c();
        c2.w("file_transfer.queryOnMessageId");
        xpe xpeVar = new xpe();
        xpeVar.b(messageIdType);
        c2.d(xpeVar);
        return (xow) agnc.b(c2.b());
    }

    public static xox b() {
        int i = wso.a;
        return new xox();
    }

    public static final xpc c() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("file_transfer.message_id");
            alobVar.h("file_transfer.transfer_id");
            alobVar.h("file_transfer.transfer_type");
            alobVar.h("file_transfer.attachment_upload_response");
            if (valueOf.intValue() >= 55030) {
                alobVar.h("file_transfer.file_information");
            }
            if (valueOf.intValue() >= 59910) {
                alobVar.h("file_transfer.thumbnail_information");
            }
            if (valueOf.intValue() >= 55030) {
                alobVar.h("file_transfer.transfer_handle");
            }
            if (valueOf.intValue() >= 56040) {
                alobVar.h("file_transfer.opaque_data");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new xpc(strArr);
    }

    public static Object d(MessageIdType messageIdType, Function function, Supplier supplier) {
        Object obj;
        Object apply;
        xow a2 = a(messageIdType);
        if (a2 != null) {
            apply = function.apply(a2);
            return apply;
        }
        obj = supplier.get();
        return obj;
    }

    public static void e(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INT PRIMARY KEY REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("transfer_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("transfer_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attachment_upload_response BLOB");
        if (i >= 55030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("file_information BLOB");
        }
        if (i >= 59910) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("thumbnail_information BLOB");
        }
        if (i >= 55030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("transfer_handle TEXT");
        }
        if (i >= 56040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("opaque_data BLOB");
        }
        sb.insert(0, "CREATE TABLE file_transfer (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58450) {
            arrayList.add("DROP INDEX IF EXISTS index_file_transfer_transfer_id");
            arrayList.add("CREATE INDEX index_file_transfer_transfer_id ON file_transfer(transfer_id);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
