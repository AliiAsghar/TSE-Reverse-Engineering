package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqx {
    public static final String[] a = {"conversations._id", "conversations.name", "conversations.name_is_automatic", "conversations.sort_timestamp", "conversations.conv_type", "group_concat(quote(conversation_participants.participant_id), '|')", "group_concat(quote(conversation_participants.rowid), '|') AS conversation_participants__ROWID", "participants._id", "group_concat(quote(participants.normalized_destination), '|')", "group_concat(quote(participants.send_destination), '|')", "group_concat(quote(participants.comparable_destination), '|')", "group_concat(quote(participants.rowid), '|') AS participants__ROWID"};
    public static final lxe b;

    static {
        lgc.F();
        alok alokVar = new alok();
        alokVar.h("sort_timestamp", "index_null_sort_timestamp");
        alokVar.b();
        b = new lxe();
    }

    public static final mqv a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(d.P().W().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("conversations._id");
            alobVar.h("conversations.name");
            if (valueOf.intValue() >= 10012) {
                alobVar.h("conversations.name_is_automatic");
            }
            alobVar.h("conversations.sort_timestamp");
            if (valueOf.intValue() >= 10007) {
                alobVar.h("conversations.conv_type");
            }
            alobVar.h("group_concat(quote(conversation_participants.participant_id), '|')");
            alobVar.h("participants._id");
            alobVar.h("group_concat(quote(participants.normalized_destination), '|')");
            alobVar.h("group_concat(quote(participants.send_destination), '|')");
            if (valueOf.intValue() >= 54040) {
                alobVar.h("group_concat(quote(participants.comparable_destination), '|')");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new mqv(strArr);
    }
}
