package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axx {
    public static final axv a = new AnonymousClass2(new axw(new arrv() { // from class: axx.1
        @Override // defpackage.arrv
        public final Object b(Object obj) {
            return Boolean.valueOf(((cps) obj).a.isCtrlPressed());
        }
    }));

    /* compiled from: PG */
    /* renamed from: axx$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 implements axv {
        final /* synthetic */ axv a;

        public AnonymousClass2(axv axvVar) {
            this.a = axvVar;
        }

        @Override // defpackage.axv
        public final axu a(KeyEvent keyEvent) {
            throw null;
        }
    }
}
