package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adop {
    public final armf a;
    public final adwe b;
    public final aijw d;
    public int e;
    public int f;
    public String g;
    public ahjj j;
    public int i = 3;
    public final aikm h = new adoo(this);
    public final String c = "presence";

    public adop(adou adouVar, armf armfVar, String str, adwe adweVar) {
        this.a = armfVar;
        this.b = adweVar;
        adew adewVar = adouVar.a;
        aikb aikbVar = ((aikc) armfVar).a;
        if (!aikbVar.u()) {
            if (!Objects.isNull(str)) {
                String v = aikb.v();
                ArrayList p = aikbVar.p();
                String e = adewVar.e();
                if (!Objects.isNull(e)) {
                    this.d = new aijw(v, 0, str, e, str, p);
                    return;
                }
                throw new aild("No public identity in ImsConfiguration.");
            }
            throw new aild("Uri is null. Can't generate dialog path");
        }
        throw new aild("No sip stack. Can't generate dialog path");
    }

    public final void a() {
        this.g = null;
        this.e = 0;
        this.i = 3;
    }
}
