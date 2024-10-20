package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlq {
    private static final CoroutineExceptionHandler c = new AnonymousClass1(CoroutineExceptionHandler.c);
    public final dle a;
    public arwe b;

    public dlq() {
        this(null, 3);
    }

    public /* synthetic */ dlq(dle dleVar, int i) {
        dleVar = (i & 1) != 0 ? new dle() : dleVar;
        arpj arpjVar = arpj.a;
        this.a = dleVar;
        arpi plus = c.plus(dpm.a).plus(arpjVar);
        arpjVar.get(arxm.c);
        this.b = arwi.e(plus.plus(new aryj(null)));
    }

    /* compiled from: PG */
    /* renamed from: dlq$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpa implements CoroutineExceptionHandler {
        public AnonymousClass1(akty aktyVar) {
            super(aktyVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(arpi arpiVar, Throwable th) {
        }
    }
}
