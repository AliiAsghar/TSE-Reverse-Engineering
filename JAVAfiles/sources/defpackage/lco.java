package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lco {
    public static final String[] a = {"message_labels._id", "message_labels.message_id", "message_labels.label", "message_labels.confidence", "message_labels.source", "message_labels.intent", "message_labels.model_id", "messages.conversation_id", "messages.received_timestamp"};
    public static final alor b;
    public static final ghw c;

    static {
        alok alokVar = new alok();
        alokVar.h("message_labels.confidence", 53060);
        alokVar.h("message_labels.intent", 58590);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("intent", "index_null_intent");
        alokVar2.b();
        c = new ghw((byte[]) null, (int[]) null);
    }

    public static final lcm a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(d.P().W().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("message_labels._id");
            alobVar.h("message_labels.message_id");
            alobVar.h("message_labels.label");
            if (valueOf.intValue() >= 53060) {
                alobVar.h("message_labels.confidence");
            }
            alobVar.h("message_labels.source");
            if (valueOf.intValue() >= 58590) {
                alobVar.h("message_labels.intent");
            }
            alobVar.h("message_labels.model_id");
            alobVar.h("messages.conversation_id");
            alobVar.h("messages.received_timestamp");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new lcm(strArr);
    }
}
