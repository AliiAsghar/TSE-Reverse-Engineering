package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vci extends wnn {
    public static final xze a = xze.g("Bugle", "TachyonOtpPattern");
    private static final utz e = uuh.h(uuh.b, "tachyon_phone_registration_code_pattern", "^(\\d{6})\\sis\\syour\\sMessages\\sverification\\scode(?:$|\\s(?s).*$)");
    public final Context b;
    public final armf c;
    private final anen f;
    private final xwk g;

    public vci(Context context, armf armfVar, anen anenVar, xwk xwkVar) {
        this.b = context;
        this.c = armfVar;
        this.f = anenVar;
        this.g = xwkVar;
    }

    @Override // defpackage.wnn
    protected final String b() {
        return (String) e.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final String c(CharSequence charSequence) {
        alog alogVar = (alog) this.d.get();
        if (alogVar.size() == 1) {
            try {
                Matcher matcher = ((Pattern) alogVar.get(0)).matcher(charSequence);
                if (matcher.find()) {
                    return matcher.group(1);
                }
                return "";
            } catch (PatternSyntaxException unused) {
                xyo b = a.b();
                b.H("Invalid pattern");
                b.z("input", b());
                b.q();
                return "";
            }
        }
        throw new IllegalStateException("Invalid OTP pattern");
    }

    @Override // defpackage.wnn, defpackage.wnp
    public final akul fO(CharSequence charSequence, int i) {
        ListenableFuture Y;
        String c = c(charSequence);
        if (TextUtils.isEmpty(c)) {
            xyo a2 = a.a();
            a2.H("Skip processing due to empty otp");
            a2.q();
            return aktp.ag(false);
        }
        xwk xwkVar = this.g;
        if (!vht.d()) {
            xwk.a.l("Tachyon phone registration is not available. Skip OTP check");
            Y = albo.bI(false);
        } else {
            String l = ((vbu) xwkVar.c.b()).l(i);
            if (TextUtils.isEmpty(l)) {
                xwk.a.l("RCS phone number is not available. Skip OTP check");
                Y = albo.bI(false);
            } else {
                Y = aktp.Y(((wyp) xwkVar.b.b()).D(l).b(), new xqp(17), andi.a);
            }
        }
        return akul.g(Y).h(new mtq(this, c, i, 6), this.f);
    }
}
