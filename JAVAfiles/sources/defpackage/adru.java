package defpackage;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adru implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ adru(int i) {
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
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean isPresent;
        boolean isPresent2;
        boolean isPresent3;
        switch (this.a) {
            case 0:
                int i = adrv.ah;
                return ((String) obj).startsWith("+g.gsma.rcs.botversion");
            case 1:
                isPresent = ((Optional) obj).isPresent();
                return isPresent;
            case 2:
                return Objects.nonNull((aiks) obj);
            case 3:
                String str = (String) obj;
                int i2 = adui.e;
                if (str == null || !str.startsWith("+")) {
                    return false;
                }
                return true;
            case 4:
                if (Thread.currentThread().getId() != ((Thread) obj).getId()) {
                    return false;
                }
                return true;
            case 5:
                advq advqVar = advq.UNKNOWN;
                return ((Optional) ((Map.Entry) obj).getValue()).isPresent();
            case 6:
                int i3 = agmp.j;
                if (obj == null) {
                    return false;
                }
                return true;
            case 7:
                if (((alog) obj).isEmpty()) {
                    return false;
                }
                return true;
            case 8:
                if (((agvd) obj).b != 2) {
                    return false;
                }
                return true;
            case 9:
                if (((agvd) obj).b != 1) {
                    return false;
                }
                return true;
            case 10:
                if (((Integer) obj).intValue() < 0) {
                    return false;
                }
                return true;
            case 11:
                if (((atmx) obj) == null) {
                    return false;
                }
                return true;
            case 12:
                String str2 = ((ajqb) obj).a;
                if (albo.ah(str2) || albo.ar(str2, "urn:ietf:params:cpim-headers:") || albo.ar(str2, "urn:ietf:params:imdn") || albo.ar(str2, "http://id.messages.google.com")) {
                    return false;
                }
                return true;
            case 13:
                return ((algw) obj).f();
            case 14:
                int i4 = akwk.d;
                albk albkVar = ((akxm) obj).d().e;
                if (albkVar == null) {
                    albkVar = albk.a;
                }
                return albkVar.b;
            case 15:
                isPresent2 = ((Optional) obj).isPresent();
                return isPresent2;
            case 16:
                if ((((albc) obj).b & 1) == 0) {
                    return false;
                }
                return true;
            default:
                isPresent3 = ((Optional) obj).isPresent();
                return isPresent3;
        }
    }
}
