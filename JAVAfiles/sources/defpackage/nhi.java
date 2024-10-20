package defpackage;

import android.media.AudioManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nhi implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nhi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, arqr] */
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        nhm nhmVar;
        if (this.b != 0) {
            ?? r0 = this.a;
            r0.getClass();
            r0.a(Integer.valueOf(i));
            return;
        }
        qdq qdqVar = ((nhm) this.a).k;
        if (i != -3 && i != -2) {
            if (i != -1) {
                if ((i == 1 || i == 2 || i == 3 || i == 4) && (nhmVar = ((nhh) qdqVar.a).f) != null) {
                    nhmVar.f();
                    return;
                }
                return;
            }
            ((nhh) qdqVar.a).d();
            return;
        }
        nhm nhmVar2 = ((nhh) qdqVar.a).f;
        if (nhmVar2 != null) {
            nhmVar2.c();
        }
    }
}
