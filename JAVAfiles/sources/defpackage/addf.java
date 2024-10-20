package defpackage;

import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class addf implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ addf(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 0:
                return Predicate$CC.$default$and(this, predicate);
            case 1:
                return Predicate$CC.$default$and(this, predicate);
            case 2:
                return Predicate$CC.$default$and(this, predicate);
            case 3:
                return Predicate$CC.$default$and(this, predicate);
            case 4:
                return Predicate$CC.$default$and(this, predicate);
            case 5:
                return Predicate$CC.$default$and(this, predicate);
            case 6:
                return Predicate$CC.$default$and(this, predicate);
            case 7:
                return Predicate$CC.$default$and(this, predicate);
            case 8:
                return Predicate$CC.$default$and(this, predicate);
            case 9:
                return Predicate$CC.$default$and(this, predicate);
            case 10:
                return Predicate$CC.$default$and(this, predicate);
            case 11:
                return Predicate$CC.$default$and(this, predicate);
            case 12:
                return Predicate$CC.$default$and(this, predicate);
            case 13:
                return Predicate$CC.$default$and(this, predicate);
            case 14:
                return Predicate$CC.$default$and(this, predicate);
            case 15:
                return Predicate$CC.$default$and(this, predicate);
            case 16:
                return Predicate$CC.$default$and(this, predicate);
            case 17:
                return Predicate$CC.$default$and(this, predicate);
            case 18:
                return Predicate$CC.$default$and(this, predicate);
            case 19:
                return Predicate$CC.$default$and(this, predicate);
            default:
                return Predicate$CC.$default$and(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo407negate() {
        switch (this.a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            case 2:
                return Predicate$CC.$default$negate(this);
            case 3:
                return Predicate$CC.$default$negate(this);
            case 4:
                return Predicate$CC.$default$negate(this);
            case 5:
                return Predicate$CC.$default$negate(this);
            case 6:
                return Predicate$CC.$default$negate(this);
            case 7:
                return Predicate$CC.$default$negate(this);
            case 8:
                return Predicate$CC.$default$negate(this);
            case 9:
                return Predicate$CC.$default$negate(this);
            case 10:
                return Predicate$CC.$default$negate(this);
            case 11:
                return Predicate$CC.$default$negate(this);
            case 12:
                return Predicate$CC.$default$negate(this);
            case 13:
                return Predicate$CC.$default$negate(this);
            case 14:
                return Predicate$CC.$default$negate(this);
            case 15:
                return Predicate$CC.$default$negate(this);
            case 16:
                return Predicate$CC.$default$negate(this);
            case 17:
                return Predicate$CC.$default$negate(this);
            case 18:
                return Predicate$CC.$default$negate(this);
            case 19:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 0:
                return Predicate$CC.$default$or(this, predicate);
            case 1:
                return Predicate$CC.$default$or(this, predicate);
            case 2:
                return Predicate$CC.$default$or(this, predicate);
            case 3:
                return Predicate$CC.$default$or(this, predicate);
            case 4:
                return Predicate$CC.$default$or(this, predicate);
            case 5:
                return Predicate$CC.$default$or(this, predicate);
            case 6:
                return Predicate$CC.$default$or(this, predicate);
            case 7:
                return Predicate$CC.$default$or(this, predicate);
            case 8:
                return Predicate$CC.$default$or(this, predicate);
            case 9:
                return Predicate$CC.$default$or(this, predicate);
            case 10:
                return Predicate$CC.$default$or(this, predicate);
            case 11:
                return Predicate$CC.$default$or(this, predicate);
            case 12:
                return Predicate$CC.$default$or(this, predicate);
            case 13:
                return Predicate$CC.$default$or(this, predicate);
            case 14:
                return Predicate$CC.$default$or(this, predicate);
            case 15:
                return Predicate$CC.$default$or(this, predicate);
            case 16:
                return Predicate$CC.$default$or(this, predicate);
            case 17:
                return Predicate$CC.$default$or(this, predicate);
            case 18:
                return Predicate$CC.$default$or(this, predicate);
            case 19:
                return Predicate$CC.$default$or(this, predicate);
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return Objects.nonNull((ajqo) obj);
            case 1:
                return ((acpk) obj).i;
            case 2:
                if (((Integer) obj).intValue() > 0) {
                    return true;
                }
                return false;
            case 3:
                return ((String) obj).startsWith("Content-Length");
            case 4:
                return ((String) obj).startsWith(assi.a);
            case 5:
                if (((Integer) obj).intValue() > 0) {
                    return true;
                }
                return false;
            case 6:
                return Objects.nonNull((String) obj);
            case 7:
                return ((String) obj).startsWith("sip:+");
            case 8:
                return ((String) obj).startsWith("tel:");
            case 9:
                return ((String) obj).startsWith("sip:");
            case 10:
                return ((InetAddress) obj) instanceof Inet6Address;
            case 11:
                return ((InetAddress) obj) instanceof Inet4Address;
            case 12:
                Predicate predicate = adiq.a;
                int ordinal = ((apgs) obj).ordinal();
                if (ordinal == 2 || ordinal == 3) {
                    return true;
                }
                return false;
            case 13:
                wgh wghVar = (wgh) obj;
                alpt alptVar = adkn.a;
                if ((wghVar.b & 2) != 0) {
                    alpt alptVar2 = adkn.a;
                    wgg wggVar = wghVar.d;
                    if (wggVar == null) {
                        wggVar = wgg.a;
                    }
                    wgf b = wgf.b(wggVar.e);
                    if (b == null) {
                        b = wgf.UNRECOGNIZED;
                    }
                    if (alptVar2.contains(b)) {
                        return true;
                    }
                }
                return false;
            case 14:
                acyz acyzVar = adlw.a;
                return ((adjn) obj).a.equals("JIBE_ACS_COOKIE");
            case 15:
                if (!((Configuration) obj).n()) {
                    return true;
                }
                return false;
            case 16:
                return ((Configuration) obj).n();
            case 17:
                return ((Configuration) obj).p();
            case 18:
                return d.an((String) obj);
            case 19:
                return d.an((String) obj);
            default:
                return d.an((String) obj);
        }
    }
}
