package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface akib {
    static {
        akia akiaVar = new akia();
        akiaVar.a(aozb.b);
        akiaVar.a(aozb.b);
        akiaVar.a = (byte) 1;
        akiaVar.b = 1;
        if (akiaVar.c == null) {
            StringBuilder sb = new StringBuilder();
            if (akiaVar.c == null) {
                sb.append(" data");
            }
            if (akiaVar.b == 0) {
                sb.append(" type");
            }
            if (akiaVar.a == 0) {
                sb.append(" containsPii");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        albo.U(true, "setProto is only compatible with type PROTO");
    }
}
