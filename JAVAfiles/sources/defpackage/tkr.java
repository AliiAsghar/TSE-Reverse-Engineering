package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tkr extends aglo {
    public static final String[] a = {"self_participants._id", "self_participants.phone_number", "self_participants.sim_serial_number", "self_participants.sim_slot_index", "self_participants.sub_id", "self_participants.subscription_name", "self_participants.subscription_color", "self_participants.participant_id", "self_participants.smsc"};
    public static final alor b;
    public static final int[] c;
    public static final uqu d;

    static {
        alok alokVar = new alok();
        alokVar.h("self_participants.smsc", 29080);
        b = alokVar.b();
        new alok().b();
        d = new uqu((byte[]) null);
        c = new int[]{29050, 29080};
    }

    public static tki a() {
        int i = tif.a;
        return new tki();
    }

    public static final tko b() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("self_participants._id");
            alobVar.h("self_participants.phone_number");
            alobVar.h("self_participants.sim_serial_number");
            alobVar.h("self_participants.sim_slot_index");
            alobVar.h("self_participants.sub_id");
            alobVar.h("self_participants.subscription_name");
            alobVar.h("self_participants.subscription_color");
            alobVar.h("self_participants.participant_id");
            if (valueOf.intValue() >= 29080) {
                alobVar.h("self_participants.smsc");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new tko(strArr);
    }

    public static void c(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("phone_number TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_serial_number TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_slot_index INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sub_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subscription_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subscription_color INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INTEGER");
        if (i >= 29080) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("smsc TEXT");
        }
        sb.insert(0, "CREATE TABLE self_participants (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
