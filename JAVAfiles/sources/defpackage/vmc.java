package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vmc implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ vmc(int i) {
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
        boolean isPresent;
        int T;
        int T2;
        boolean z;
        boolean isPresent2;
        int af;
        int T3;
        switch (this.a) {
            case 0:
                return ((vmq) obj).e;
            case 1:
                return ((ParticipantsTable.BindData) obj).T();
            case 2:
                return ((vmq) obj).d;
            case 3:
                return ((vmq) obj).f;
            case 4:
                return ((vla) obj).f;
            case 5:
                if (((vla) obj).c == 3) {
                    return true;
                }
                return false;
            case 6:
                return ((rry) obj).au();
            case 7:
                return ((MessagePartCoreData) obj).bc();
            case 8:
                return ((Bundle) obj).containsKey("extra_im_notification_conversation_id");
            case 9:
                uuf uufVar = vqw.c;
                return ((msh) obj).e().isPresent();
            case 10:
                return ((vtu) obj).b;
            case 11:
                isPresent = ((Optional) obj).isPresent();
                return isPresent;
            case 12:
                wfq wfqVar = (wfq) obj;
                if (wft.e(wfqVar)) {
                    wfp b = wfp.b(wfqVar.d);
                    if (b == null) {
                        b = wfp.UNRECOGNIZED;
                    }
                    if (b.equals(wfp.BANNER)) {
                        return true;
                    }
                }
                return false;
            case 13:
                wfq wfqVar2 = (wfq) obj;
                xze xzeVar = wft.a;
                int aT = a.aT(wfqVar2.c);
                if (aT == 0) {
                    aT = 1;
                }
                int i = wfqVar2.e;
                int T4 = a.T(i);
                if ((T4 != 0 && T4 == 4) || (((T = a.T(i)) != 0 && T == 6) || ((T2 = a.T(i)) != 0 && T2 == 5))) {
                    z = true;
                } else {
                    z = false;
                }
                if (aT == 3 && z) {
                    return true;
                }
                return false;
            case 14:
                return wft.e((wfq) obj);
            case 15:
                wfy wfyVar = (wfy) obj;
                int Z = a.Z(wfyVar.c);
                if (Z != 0 && Z == 3) {
                    int i2 = wfyVar.d;
                    int af2 = a.af(i2);
                    if (af2 != 0 && af2 == 4) {
                        return true;
                    }
                    int af3 = a.af(i2);
                    if (af3 != 0 && af3 == 10) {
                        return true;
                    }
                    int af4 = a.af(i2);
                    if (af4 != 0 && af4 == 9) {
                        return true;
                    }
                }
                return false;
            case 16:
                return Objects.nonNull((Optional) obj);
            case 17:
                isPresent2 = ((Optional) obj).isPresent();
                return isPresent2;
            case 18:
                wfy wfyVar2 = (wfy) obj;
                int Z2 = a.Z(wfyVar2.c);
                if (Z2 != 0 && Z2 == 3 && (af = a.af(wfyVar2.d)) != 0 && af == 3) {
                    return true;
                }
                return false;
            case 19:
                wfy wfyVar3 = (wfy) obj;
                int Z3 = a.Z(wfyVar3.c);
                if (Z3 != 0 && Z3 == 3) {
                    if ((wfyVar3.b & 64) != 0) {
                        int af5 = a.af(wfyVar3.d);
                        if (af5 != 0 && af5 == 9) {
                            return true;
                        }
                        wfx wfxVar = wfx.INPUT_BOTTOMSHEET;
                        wfx b2 = wfx.b(wfyVar3.h);
                        if (b2 == null) {
                            b2 = wfx.UNRECOGNIZED;
                        }
                        if (wfxVar.equals(b2)) {
                            int af6 = a.af(wfyVar3.d);
                            if (af6 != 0 && af6 == 10) {
                                return true;
                            }
                        } else {
                            wfx wfxVar2 = wfx.INPUT_FULLSCREEN;
                            wfx b3 = wfx.b(wfyVar3.h);
                            if (b3 == null) {
                                b3 = wfx.UNRECOGNIZED;
                            }
                            if (wfxVar2.equals(b3)) {
                                int i3 = wfyVar3.d;
                                int af7 = a.af(i3);
                                if (af7 != 0 && af7 == 5) {
                                    return true;
                                }
                                int af8 = a.af(i3);
                                if (af8 != 0 && af8 == 10) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        int i4 = wfyVar3.d;
                        int af9 = a.af(i4);
                        if (af9 != 0 && af9 == 5) {
                            return true;
                        }
                        int af10 = a.af(i4);
                        if (af10 != 0 && af10 == 6) {
                            return true;
                        }
                        int af11 = a.af(i4);
                        if (af11 != 0 && af11 == 7) {
                            return true;
                        }
                        int af12 = a.af(i4);
                        if (af12 != 0 && af12 == 8) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                wfq wfqVar3 = (wfq) obj;
                xze xzeVar2 = whj.a;
                int aT2 = a.aT(wfqVar3.c);
                if (aT2 != 0 && aT2 == 3 && (T3 = a.T(wfqVar3.e)) != 0 && T3 == 3) {
                    return true;
                }
                return false;
        }
    }
}
