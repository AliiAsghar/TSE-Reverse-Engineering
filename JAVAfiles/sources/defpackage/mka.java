package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mka {
    public Object a;

    public mka() {
    }

    public static Intent c(Context context) {
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.parse("package:".concat(String.valueOf(context.getPackageName()))));
        return intent;
    }

    public static void i(View view, eeu eeuVar) {
        efa efaVar = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (eeuVar != null) {
                efaVar = new efa(eeuVar);
            }
            view.setWindowInsetsAnimationCallback(efaVar);
            return;
        }
        Interpolator interpolator = eez.a;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (eeuVar == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener eeyVar = new eey(view, eeuVar);
        view.setTag(R.id.tag_window_insets_animation_callback, eeyVar);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(eeyVar);
        }
    }

    public final kks a() {
        if (this.a == null) {
            int i = alog.d;
            this.a = alsx.a;
        }
        kks kksVar = new kks((alog) this.a);
        d.s(!kksVar.a.isEmpty());
        return kksVar;
    }

    public final void b(Iterable iterable) {
        this.a = alog.j(iterable);
    }

    public final synchronized boolean d(Context context) {
        boolean z;
        if (this.a == null) {
            if (c(context).resolveActivity(context.getPackageManager()) != null) {
                z = true;
            } else {
                z = false;
            }
            this.a = Boolean.valueOf(z);
        }
        return ((Boolean) this.a).booleanValue();
    }

    public final void e() {
        this.a = null;
        synchronized (eui.a) {
            if (eui.a.size() < 50) {
                eui.a.add(this);
            }
        }
    }

    public final void f() {
        Object obj = this.a;
        dzg.g(obj);
        ((Message) obj).sendToTarget();
        e();
    }

    public final float g() {
        return ((efc) this.a).g();
    }

    public final long h() {
        return ((efc) this.a).i();
    }

    public final void j(float f) {
        ((efc) this.a).j(f);
    }

    public final void k(int i) {
        this.a = Integer.valueOf(i | (-16777216));
    }

    public final efu l() {
        return new efu(this.a, (byte[]) null);
    }

    public mka(byte[] bArr) {
        this.a = lga.F(altc.a, null, null);
    }

    public mka(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = null;
    }

    public mka(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new efb(new WindowInsetsAnimation(i, interpolator, j));
        } else {
            this.a = new eez(i, interpolator, j);
        }
    }

    public mka(byte[] bArr, char[] cArr) {
        Collections.emptyList();
        this.a = Collections.emptyList();
    }

    public mka(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (Interpolator) null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new efb(windowInsetsAnimation);
        }
    }
}
