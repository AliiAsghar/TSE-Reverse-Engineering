package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyz extends dzk {
    public PendingIntent a;
    public PendingIntent b;
    public PendingIntent c;
    public boolean d;
    public Integer e;
    public Integer f;
    private int k;
    private dzv l;
    private IconCompat m;
    private CharSequence n;

    @Override // defpackage.dzk
    protected final String a() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dzk
    public final void c(Bundle bundle) {
        Integer num;
        super.c(bundle);
        this.k = bundle.getInt("android.callType");
        this.d = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.l = dyf.c(cok$$ExternalSyntheticApiModelOutline0.m((Object) bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.l = dzv.b(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            this.m = dzd.h((Icon) bundle.getParcelable("android.verificationIcon"));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.m = IconCompat.e(bundle.getBundle("android.verificationIconCompat"));
        }
        this.n = bundle.getCharSequence("android.verificationText");
        this.a = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.b = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.c = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        Integer num2 = null;
        if (bundle.containsKey("android.answerColor")) {
            num = Integer.valueOf(bundle.getInt("android.answerColor"));
        } else {
            num = null;
        }
        this.e = num;
        if (bundle.containsKey("android.declineColor")) {
            num2 = Integer.valueOf(bundle.getInt("android.declineColor"));
        }
        this.f = num2;
    }

    public final dyk d(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(this.g.a.getColor(i3));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.g.a.getResources().getString(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        dyk a = new dyj(IconCompat.g(this.g.a, i), spannableStringBuilder, pendingIntent).a();
        a.a.putBoolean("key_action_priority", true);
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.CharSequence] */
    @Override // defpackage.dzk
    public final void f(fqf fqfVar) {
        CharSequence charSequence;
        String str;
        String str2 = null;
        r5 = null;
        Notification.CallStyle a = null;
        if (Build.VERSION.SDK_INT >= 31) {
            int i = this.k;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (Log.isLoggable("NotifCompat", 3)) {
                            Log.d("NotifCompat", "Unrecognized call type in CallStyle: ".concat(String.valueOf(String.valueOf(this.k))));
                        }
                    } else {
                        a = dyy.c(dyf.b(this.l), this.c, this.a);
                    }
                } else {
                    a = dyy.b(dyf.b(this.l), this.c);
                }
            } else {
                a = dyy.a(dyf.b(this.l), this.b, this.a);
            }
            if (a != null) {
                a.setBuilder((Notification.Builder) fqfVar.e);
                Integer num = this.e;
                if (num != null) {
                    dyy.d(a, num.intValue());
                }
                Integer num2 = this.f;
                if (num2 != null) {
                    dyy.e(a, num2.intValue());
                }
                dyy.h(a, this.n);
                IconCompat iconCompat = this.m;
                if (iconCompat != null) {
                    dyy.g(a, dzd.f(iconCompat, this.g.a));
                }
                dyy.f(a, this.d);
                return;
            }
            return;
        }
        Object obj = fqfVar.e;
        dzv dzvVar = this.l;
        if (dzvVar != null) {
            charSequence = dzvVar.a;
        } else {
            charSequence = null;
        }
        Notification.Builder builder = (Notification.Builder) obj;
        builder.setContentTitle(charSequence);
        Bundle bundle = this.g.B;
        if (bundle != null && bundle.containsKey("android.text")) {
            str = this.g.B.getCharSequence("android.text");
        } else {
            str = null;
        }
        if (str == null) {
            int i2 = this.k;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        str2 = this.g.a.getResources().getString(R.string.call_notification_screening_text);
                    }
                } else {
                    str2 = this.g.a.getResources().getString(R.string.call_notification_ongoing_text);
                }
            } else {
                str2 = this.g.a.getResources().getString(R.string.call_notification_incoming_text);
            }
        } else {
            str2 = str;
        }
        builder.setContentText(str2);
        dzv dzvVar2 = this.l;
        if (dzvVar2 != null) {
            IconCompat iconCompat2 = dzvVar2.b;
            if (iconCompat2 != null) {
                dyw.a(builder, dzd.f(iconCompat2, this.g.a));
            }
            if (Build.VERSION.SDK_INT >= 28) {
                dyx.a(builder, dyf.b(this.l));
            } else {
                dyv.a(builder, this.l.c);
            }
        }
        dyv.b(builder, "call");
    }

    @Override // defpackage.dzk
    public final void i(Bundle bundle) {
        super.i(bundle);
        bundle.putInt("android.callType", this.k);
        bundle.putBoolean("android.callIsVideo", this.d);
        if (this.l != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("android.callPerson", dyf.b(this.l));
            } else {
                bundle.putParcelable("android.callPersonCompat", this.l.a());
            }
        }
        IconCompat iconCompat = this.m;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", dzd.f(iconCompat, this.g.a));
        }
        bundle.putCharSequence("android.verificationText", this.n);
        bundle.putParcelable("android.answerIntent", this.a);
        bundle.putParcelable("android.declineIntent", this.b);
        bundle.putParcelable("android.hangUpIntent", this.c);
        Integer num = this.e;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }
}
