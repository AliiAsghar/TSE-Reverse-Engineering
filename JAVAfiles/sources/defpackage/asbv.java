package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asbv extends arpw implements arqv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ asai e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asbv(asai asaiVar, ascc asccVar, Object obj, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.d = asaiVar;
        this.e = asccVar;
        this.c = obj;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((asbv) c((asaj) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((asbv) c((ascm) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [asai, ascc] */
    /* JADX WARN: Type inference failed for: r2v1, types: [asaj, asai] */
    /* JADX WARN: Type inference failed for: r8v4, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [asai, ascc] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arrx arrxVar;
        if (this.f != 0) {
            arpl arplVar = arpl.a;
            if (this.a != 0) {
                arrxVar = (arrx) this.b;
                aqil.P(obj);
            } else {
                aqil.P(obj);
                asaj asajVar = (asaj) this.b;
                arrx arrxVar2 = new arrx();
                asai asaiVar = this.e;
                jen jenVar = new jen(arrxVar2, asajVar, this.c, 4);
                this.b = arrxVar2;
                this.a = 1;
                if (asaiVar.a(jenVar, this) != arplVar) {
                    arrxVar = arrxVar2;
                } else {
                    return arplVar;
                }
            }
            if (arrxVar.a) {
                return arnb.a;
            }
            Object obj2 = this.d;
            Object obj3 = this.c;
            throw new StatusException(Status.m.withDescription("Expected one " + ((String) obj2) + " for " + obj3 + " but received none"));
        }
        arpl arplVar2 = arpl.a;
        if (this.a != 0) {
            aqil.P(obj);
        } else {
            aqil.P(obj);
            int ordinal = ((ascm) this.b).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        Object obj4 = this.c;
                        if (obj4 == asck.a) {
                            this.e.e();
                        } else {
                            this.e.h(obj4);
                        }
                    } else {
                        throw new armm();
                    }
                }
            } else {
                ?? r8 = this.d;
                ?? r2 = this.e;
                this.a = 1;
                if (r8.a(r2, this) == arplVar2) {
                    return arplVar2;
                }
            }
        }
        return arnb.a;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [asai, ascc] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.f != 0) {
            asbv asbvVar = new asbv(this.e, this.c, arpeVar, 1);
            asbvVar.b = obj;
            return asbvVar;
        }
        asbv asbvVar2 = new asbv(this.d, this.e, this.c, arpeVar, 0);
        asbvVar2.b = obj;
        return asbvVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asbv(asai asaiVar, Object obj, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.e = asaiVar;
        this.d = GroupManagementRequest.XML_TAG;
        this.c = obj;
    }
}
