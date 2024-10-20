package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmy implements OnBackAnimationCallback {
    final /* synthetic */ arwe a;
    final /* synthetic */ zj b;
    final /* synthetic */ arqg c;

    /* compiled from: PG */
    /* renamed from: bmy$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ zj b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(zj zjVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = zjVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                zj zjVar = this.b;
                Float f = new Float(brg.a);
                this.a = 1;
                if (zj.j(zjVar, f, null, this, 14) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.b, arpeVar);
        }
    }

    /* compiled from: PG */
    /* renamed from: bmy$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ zj b;
        final /* synthetic */ BackEvent c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(zj zjVar, BackEvent backEvent, arpe arpeVar) {
            super(2, arpeVar);
            this.b = zjVar;
            this.c = backEvent;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            float progress;
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                zj zjVar = this.b;
                progress = this.c.getProgress();
                Float f = new Float(btm.a(progress));
                this.a = 1;
                if (zjVar.e(f, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass2(this.b, this.c, arpeVar);
        }
    }

    /* compiled from: PG */
    /* renamed from: bmy$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ zj b;
        final /* synthetic */ BackEvent c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(zj zjVar, BackEvent backEvent, arpe arpeVar) {
            super(2, arpeVar);
            this.b = zjVar;
            this.c = backEvent;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass3) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            float progress;
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                zj zjVar = this.b;
                progress = this.c.getProgress();
                Float f = new Float(btm.a(progress));
                this.a = 1;
                if (zjVar.e(f, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass3(this.b, this.c, arpeVar);
        }
    }

    public bmy(arwe arweVar, zj zjVar, arqg arqgVar) {
        this.a = arweVar;
        this.b = zjVar;
        this.c = arqgVar;
    }

    public final void onBackCancelled() {
        arrn.J(this.a, null, null, new AnonymousClass1(this.b, null), 3);
    }

    public final void onBackInvoked() {
        this.c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        arrn.J(this.a, null, null, new AnonymousClass2(this.b, backEvent, null), 3);
    }

    public final void onBackStarted(BackEvent backEvent) {
        arrn.J(this.a, null, null, new AnonymousClass3(this.b, backEvent, null), 3);
    }
}
