package defpackage;

import android.R;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvv implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ aktr a;
    final /* synthetic */ ViewTreeObserver.OnPreDrawListener b;
    final /* synthetic */ kvw c;
    private final /* synthetic */ int d;

    public kvv(kvw kvwVar, aktr aktrVar, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i) {
        this.d = i;
        this.a = aktrVar;
        this.b = onPreDrawListener;
        this.c = kvwVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        aksa a;
        if (this.d != 0) {
            try {
                a = this.a.a();
                try {
                    boolean onPreDraw = this.b.onPreDraw();
                    a.close();
                    return onPreDraw;
                } finally {
                }
            } finally {
                kvw kvwVar = this.c;
                if (kvwVar.aC) {
                    kvwVar.b(kvwVar.b).getViewTreeObserver().removeOnPreDrawListener(this);
                    this.c.aA = new kvu(0);
                }
            }
        }
        try {
            a = this.a.a();
            try {
                boolean onPreDraw2 = this.b.onPreDraw();
                a.close();
                if (this.c.aC) {
                    alvw g = kvw.a.g();
                    g.X(alwp.a, "HomeFragmentFlogger");
                    ((alvg) ((alvg) g).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 4100, "HomeFragmentPeer.java")).q("HomeScreen ready. Removing splash screen.");
                    this.c.b.F().findViewById(R.id.content).getViewTreeObserver().removeOnPreDrawListener(this);
                } else {
                    alvw g2 = kvw.a.g();
                    g2.X(alwp.a, "HomeFragmentFlogger");
                    ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 4107, "HomeFragmentPeer.java")).q("HomeScreen not ready. Keeping splash screen.");
                }
                return onPreDraw2;
            } finally {
                try {
                    a.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } catch (Throwable th2) {
            if (this.c.aC) {
                alvw g3 = kvw.a.g();
                g3.X(alwp.a, "HomeFragmentFlogger");
                ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 4100, "HomeFragmentPeer.java")).q("HomeScreen ready. Removing splash screen.");
                this.c.b.F().findViewById(R.id.content).getViewTreeObserver().removeOnPreDrawListener(this);
            } else {
                alvw g4 = kvw.a.g();
                g4.X(alwp.a, "HomeFragmentFlogger");
                ((alvg) ((alvg) g4).h("com/google/android/apps/messaging/home/HomeFragmentPeer$25", "onPreDraw", 4107, "HomeFragmentPeer.java")).q("HomeScreen not ready. Keeping splash screen.");
            }
            throw th2;
        }
    }
}
