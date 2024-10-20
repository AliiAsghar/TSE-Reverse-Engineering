package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qqc {
    public static final String[] a = {"conversations._id", "conversations.conv_type", "conversations.has_ea2p_bot_recipient", "group_concat(quote(conversation_to_participants.participant_id), '|')", "group_concat(quote(conversation_to_participants.rowid), '|') AS conversation_to_participants__ROWID", "participants._id", "group_concat(quote(participants.normalized_destination), '|')", "group_concat(quote(participants.send_destination), '|')", "group_concat(quote(participants.rowid), '|') AS participants__ROWID"};
    public static final uac b;

    static {
        alok alokVar = new alok();
        alokVar.h("conversations.conv_type", 10007);
        alokVar.h("conversations.has_ea2p_bot_recipient", 12001);
        alokVar.b();
        new alok().b();
        b = new uac((char[]) null, (byte[]) null);
    }

    public static final qqa a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(d.P().W().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("conversations._id");
            if (valueOf.intValue() >= 10007) {
                alobVar.h("conversations.conv_type");
            }
            if (valueOf.intValue() >= 12001) {
                alobVar.h("conversations.has_ea2p_bot_recipient");
            }
            alobVar.h("group_concat(quote(conversation_to_participants.participant_id), '|')");
            alobVar.h("participants._id");
            alobVar.h("group_concat(quote(participants.normalized_destination), '|')");
            alobVar.h("group_concat(quote(participants.send_destination), '|')");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new qqa(strArr);
    }
}
