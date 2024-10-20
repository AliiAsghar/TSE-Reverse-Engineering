package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vbl implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vbl(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v105, types: [vgq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v95, types: [vgq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [vgq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [vgq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [vfc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [vgq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40, types: [vgq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        akul l;
        akul l2;
        int i = 3;
        int i2 = 0;
        int i3 = 2;
        switch (this.c) {
            case 0:
                return ((vay) ((vbm) this.a).i.b()).a(this.b);
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    return aktp.ag(new vbb(3, false));
                }
                vbm vbmVar = (vbm) this.a;
                if (vbmVar.k.H()) {
                    return aktp.ag(new vbb(3, false));
                }
                rto rtoVar = (rto) this.b;
                Optional n = rtoVar.n();
                if (n.isEmpty()) {
                    xyo e = vbm.a.e();
                    e.H("Other participant normalized destination should not be empty for a 1-1 conversation.");
                    e.z("conversation ID", rtoVar.L());
                    e.q();
                    return aktp.ag(new vbb(3, false));
                }
                return vbmVar.l.b((msh) n.get()).h(new vbj(i3), vbmVar.g).h(new vbj(i2), vbmVar.g);
            case 2:
                return ((vay) ((vbm) this.a).i.b()).b(this.b);
            case 3:
                return ((vay) ((vbm) this.a).i.b()).b(this.b);
            case 4:
                byte[] bArr = (byte[]) obj;
                if (bArr != null && bArr.length != 0) {
                    Object obj2 = this.b;
                    vbq vbqVar = (vbq) obj2;
                    aozy S = vbqVar.t.S("RCS");
                    aozb w = aozb.w(bArr);
                    if (!S.b.isMutable()) {
                        S.u();
                    }
                    Object obj3 = this.a;
                    aqgb aqgbVar = (aqgb) S.b;
                    aqgb aqgbVar2 = aqgb.a;
                    aqgbVar.e = w;
                    int i4 = 7;
                    return akul.g(((vfo) obj3).c((aqgb) S.s())).i(new vbl(obj2, obj3, i4, null), vbqVar.n).i(new vbn(obj3, i2), vbqVar.i).i(new vbn(obj2, i3), vbqVar.n).h(new uzs(obj2, i4), vbqVar.i).f(Throwable.class, new vbn(obj2, i), andi.a);
                }
                alvw g = vbq.a.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "provideOtpCode", 572, "PhoneRegistrationProvider.java")).q("No auth token for Verify. Skip this OTP code.");
                return aktp.ag(false);
            case 5:
                return this.a.c((aqgb) ((vbq) this.b).t.S("RCS").s());
            case 6:
                return this.a.d(((vbq) this.b).p, (aqes) obj);
            case 7:
                return ((vfo) this.a).d(((vbq) this.b).p, (aqfe) obj);
            case 8:
                alvi alviVar = vbq.a;
                return ((vel) this.b).b.j(new veg(this.a, i)).h(new vdx(18), andi.a);
            case 9:
                return ((vby) this.a).r(((vaz) this.b).e);
            case 10:
                return this.a.d(((vby) this.b).p, (aqeq) obj);
            case 11:
                apbt apbtVar = (apbt) obj;
                ?? r2 = this.a;
                Object obj4 = this.b;
                if (apbtVar != null) {
                    ((vcc) obj4).f.g("Bugle.Network.Rpc.Request.Size.Bytes", apbtVar.getSerializedSize());
                    r2.i();
                }
                return r2.d(((vcc) obj4).b, apbtVar);
            case 12:
                Throwable th = (Throwable) obj;
                if (vch.a(th) == Status.Code.UNAUTHENTICATED) {
                    ?? r1 = this.a;
                    Object obj5 = this.b;
                    xzb.c("BugleNetwork", "Handle UNAUTHENTICATED error by immediately refresh registration.");
                    vgp b = r1.b();
                    int ordinal = b.a().ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                l = ((vcc) obj5).c.a((vgm) b).i(new uva(8), andi.a);
                            } else {
                                throw new UnsupportedOperationException("unknown registration type ".concat(b.toString()));
                            }
                        } else {
                            l = ((vcc) obj5).a.l(vaz.FORCE_REFRESH);
                        }
                        return ((vcc) obj5).c(r1, l);
                    }
                    throw new UnsupportedOperationException("UNREGISTERED support not implemented");
                }
                return aktp.af(th);
            case 13:
                apbt apbtVar2 = (apbt) obj;
                ?? r22 = this.a;
                Object obj6 = this.b;
                if (apbtVar2 != null) {
                    ((vcf) obj6).d.g("Bugle.Network.Rpc.Request.Size.Bytes", apbtVar2.getSerializedSize());
                    r22.i();
                }
                return r22.d(((vcf) obj6).b, apbtVar2);
            case 14:
                Throwable th2 = (Throwable) obj;
                if (vch.a(th2) == Status.Code.UNAUTHENTICATED) {
                    ?? r12 = this.a;
                    Object obj7 = this.b;
                    xzb.c("BugleNetwork", "Handle UNAUTHENTICATED error by immediately refresh registration.");
                    vgp b2 = r12.b();
                    int ordinal2 = b2.a().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3 && ordinal2 != 4) {
                                    throw new UnsupportedOperationException("unknown registration type ".concat(b2.toString()));
                                }
                            } else {
                                l2 = ((vcf) obj7).c.a((vgm) b2).i(new uva(9), andi.a);
                                return ((vcf) obj7).b(r12, l2);
                            }
                        }
                        l2 = ((vcf) obj7).a.l(vaz.FORCE_REFRESH);
                        return ((vcf) obj7).b(r12, l2);
                    }
                    throw new UnsupportedOperationException("UNREGISTERED support not implemented");
                }
                return aktp.af(th2);
            case 15:
                ((AtomicReference) this.a).set((vee) obj);
                return ((vel) this.b).b.f();
            case 16:
                AtomicReference atomicReference = (AtomicReference) this.a;
                ved b3 = ved.b(((vee) atomicReference.get()).i);
                if (b3 == null) {
                    b3 = ved.UNRECOGNIZED;
                }
                vel velVar = (vel) this.b;
                velVar.q(b3, ved.UNSET_TACHYON_STATE, 6);
                ved b4 = ved.b(((vee) atomicReference.get()).i);
                if (b4 == null) {
                    b4 = ved.UNRECOGNIZED;
                }
                return velVar.p(b4, ved.UNSET_TACHYON_STATE, 6);
            case 17:
                AtomicReference atomicReference2 = (AtomicReference) this.a;
                ved b5 = ved.b(((vee) atomicReference2.get()).i);
                if (b5 == null) {
                    b5 = ved.UNRECOGNIZED;
                }
                vel velVar2 = (vel) this.b;
                velVar2.q(b5, ved.NOT_REGISTERED, 2);
                ved b6 = ved.b(((vee) atomicReference2.get()).i);
                if (b6 == null) {
                    b6 = ved.UNRECOGNIZED;
                }
                return velVar2.p(b6, ved.NOT_REGISTERED, 2);
            case 18:
                alpt alptVar = (alpt) obj;
                ?? r23 = this.b;
                Object obj8 = this.a;
                wyp wypVar = (wyp) obj8;
                akul w2 = wypVar.w(((ndi) wypVar.f).d(r23).b(), alptVar);
                akul w3 = wypVar.w(wypVar.x(r23), alptVar);
                return aktp.ap(w2, w3).h(akto.k(new rbn(obj8, w2, w3, 11)), wypVar.d);
            case 19:
                ven venVar = (ven) obj;
                akul akulVar = venVar.b;
                Object obj9 = this.b;
                return akulVar.i(new ukk(obj9, (Object) venVar, this.a, 9, (byte[]) null), ((ahmv) obj9).a);
            default:
                uea ueaVar = new uea((aqfn) obj, 10);
                vep vepVar = (vep) this.b;
                vfb N = vepVar.d.N(vepVar.a, vepVar.b, vepVar.c, ueaVar);
                return N.b((aqgb) this.a, N.a());
        }
    }

    public /* synthetic */ vbl(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
