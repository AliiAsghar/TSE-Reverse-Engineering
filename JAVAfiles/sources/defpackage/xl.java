package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class xl {
    public static final xl a = new xm(new zh(null, null, null, null, false, null, 63));

    public final xl a(xl xlVar) {
        zh zhVar = ((xm) xlVar).b;
        xp xpVar = zhVar.a;
        if (xpVar == null) {
            xpVar = b().a;
        }
        xp xpVar2 = xpVar;
        zd zdVar = zhVar.b;
        if (zdVar == null) {
            zdVar = b().b;
        }
        zd zdVar2 = zdVar;
        wn wnVar = zhVar.c;
        if (wnVar == null) {
            wnVar = b().c;
        }
        wn wnVar2 = wnVar;
        xw xwVar = zhVar.d;
        if (xwVar == null) {
            xwVar = b().d;
        }
        return new xm(new zh(xpVar2, zdVar2, wnVar2, xwVar, false, aqjn.p(b().f, zhVar.f), 16));
    }

    public abstract zh b();

    public final boolean equals(Object obj) {
        if ((obj instanceof xl) && d.F(((xl) obj).b(), b())) {
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
            return "EnterTransition.None";
        }
        zh b = b();
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        xp xpVar = b.a;
        String str4 = null;
        if (xpVar != null) {
            str = xpVar.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",\nSlide - ");
        zd zdVar = b.b;
        if (zdVar != null) {
            str2 = zdVar.toString();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(",\nShrink - ");
        wn wnVar = b.c;
        if (wnVar != null) {
            str3 = wnVar.toString();
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(",\nScale - ");
        xw xwVar = b.d;
        if (xwVar != null) {
            str4 = xwVar.toString();
        }
        sb.append(str4);
        return sb.toString();
    }
}
