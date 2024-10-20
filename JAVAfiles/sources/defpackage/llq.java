package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llq implements lju {
    public final Context a;
    private final /* synthetic */ int b;
    private final Object c;

    public llq(Optional optional, Activity activity, int i) {
        this.b = i;
        this.c = optional;
        this.a = activity;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qky] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qky] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, qky] */
    /* JADX WARN: Type inference failed for: r8v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [armf, java.lang.Object] */
    @Override // defpackage.lju
    public final /* synthetic */ Object a(lkf lkfVar, arpe arpeVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            los losVar = (los) lkfVar;
                            ((Optional) this.c.b()).ifPresent(new leq(new eiw((Object) this, (Object) losVar.a, (Object) losVar.b, 15, (char[]) null), 4));
                            return arnb.a;
                        }
                        Uri uri = ((lor) lkfVar).a;
                        this.c.c(this.a, uri);
                        return arnb.a;
                    }
                    ((Optional) this.c).ifPresent(new leq(new lnn(this, 0), 3));
                    return arnb.a;
                }
                ((psh) this.c.b()).a(this.a, ((lng) lkfVar).a);
                return arnb.a;
            }
            llf llfVar = (llf) lkfVar;
            ksm ksmVar = (ksm) this.c.b();
            String str = llfVar.a;
            String str2 = llfVar.b;
            akul g = akul.g(agkx.f(ksmVar.j(this.a)));
            g.getClass();
            Object F = arro.F(g, arpeVar);
            if (F == arpl.a) {
                return F;
            }
            return arnb.a;
        }
        llp llpVar = (llp) lkfVar;
        Uri uri2 = llpVar.a;
        if (uri2 != null) {
            this.c.f(this.a, uri2, llpVar.d, llpVar.c);
        } else {
            msh mshVar = llpVar.b;
            if (mshVar != null) {
                this.c.d(this.a, mshVar, llpVar.d, llpVar.c);
            } else {
                throw new IllegalArgumentException("Either contactUri or identity must be set.");
            }
        }
        return arnb.a;
    }

    public llq(Context context, armf armfVar, int i) {
        this.b = i;
        armfVar.getClass();
        this.a = context;
        this.c = armfVar;
    }

    public llq(Context context, qky qkyVar, int i, byte[] bArr) {
        this.b = i;
        qkyVar.getClass();
        this.a = context;
        this.c = qkyVar;
    }

    public llq(Context context, armf armfVar, int i, char[] cArr) {
        this.b = i;
        armfVar.getClass();
        this.a = context;
        this.c = armfVar;
    }

    public llq(Context context, qky qkyVar, int i) {
        this.b = i;
        qkyVar.getClass();
        this.a = context;
        this.c = qkyVar;
    }

    public llq(Context context, armf armfVar, int i, byte[] bArr) {
        this.b = i;
        armfVar.getClass();
        this.a = context;
        this.c = armfVar;
    }
}
