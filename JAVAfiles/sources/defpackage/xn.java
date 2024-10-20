package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class xn {
    public static final xn a = new xo(new zh(null, null, null, null, false, null, 63));
    private static final xn b = new xo(new zh(null, null, null, null, true, null, 47));

    public final xn a(xn xnVar) {
        xp xpVar = xnVar.b().a;
        if (xpVar == null) {
            xpVar = b().a;
        }
        xp xpVar2 = xpVar;
        zd zdVar = xnVar.b().b;
        if (zdVar == null) {
            zdVar = b().b;
        }
        zd zdVar2 = zdVar;
        wn wnVar = xnVar.b().c;
        if (wnVar == null) {
            wnVar = b().c;
        }
        wn wnVar2 = wnVar;
        xw xwVar = xnVar.b().d;
        if (xwVar == null) {
            xwVar = b().d;
        }
        xw xwVar2 = xwVar;
        boolean z = true;
        if (!xnVar.b().e && !b().e) {
            z = false;
        }
        return new xo(new zh(xpVar2, zdVar2, wnVar2, xwVar2, z, aqjn.p(b().f, xnVar.b().f)));
    }

    public abstract zh b();

    public final boolean equals(Object obj) {
        if ((obj instanceof xn) && d.F(((xn) obj).b(), b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (d.F(this, a)) {
            return "ExitTransition.None";
        }
        if (d.F(this, b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        zh b2 = b();
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        xp xpVar = b2.a;
        String str4 = null;
        if (xpVar != null) {
            str = xpVar.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",\nSlide - ");
        zd zdVar = b2.b;
        if (zdVar != null) {
            str2 = zdVar.toString();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(",\nShrink - ");
        wn wnVar = b2.c;
        if (wnVar != null) {
            str3 = wnVar.toString();
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(",\nScale - ");
        xw xwVar = b2.d;
        if (xwVar != null) {
            str4 = xwVar.toString();
        }
        sb.append(str4);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(b2.e);
        return sb.toString();
    }
}
