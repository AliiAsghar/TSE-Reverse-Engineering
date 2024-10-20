package defpackage;

import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public abstract class ajpd {
    static {
        algc algcVar = alfn.a;
        algc algcVar2 = alfv.a;
        algc.m("()<>@,;:\\\"/[]?=");
        algc.m("\"\\\r");
        algc.l(" \t\r\n");
    }

    public abstract alor a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c());
        sb.append('/');
        sb.append(b());
        aluq listIterator = a().entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            sb.append("; ");
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }
}
