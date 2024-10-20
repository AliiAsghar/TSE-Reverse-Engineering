package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adnc extends adnf {
    public static final /* synthetic */ int a = 0;
    private static final advp d = new advp("RcsOtpSmsHandler");
    private Pattern e;
    private final Context f;
    private final adnv g;
    private final vau h;
    private final Optional i;
    private final acnz j;
    private final ahjj k;

    public adnc(Context context, ahjj ahjjVar, acnz acnzVar, adnv adnvVar, vau vauVar, Optional optional) {
        this.f = context;
        this.k = ahjjVar;
        this.j = acnzVar;
        this.g = adnvVar;
        this.h = vauVar;
        this.i = optional;
    }

    private final Pattern e() {
        String str;
        if (aczv.x() && aczv.W()) {
            if (this.i.isPresent()) {
                str = this.h.c((String) this.i.get()).j;
            } else {
                str = null;
            }
        } else {
            str = (String) acpq.E().p().a();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Pattern.compile(str);
            } catch (PatternSyntaxException e) {
                advr.i(e, "Error parsing otp pattern [%s]", str);
                return null;
            }
        }
        advr.c("Otp pattern not set", new Object[0]);
        return null;
    }

    @Deprecated
    public final synchronized void a() {
        b(this.g.a());
    }

    @Override // defpackage.adnf
    public final synchronized void b(int i) {
        this.e = e();
        super.b(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ba  */
    @Override // defpackage.adnf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean c(java.lang.String r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adnc.c(java.lang.String, int, int):boolean");
    }
}
