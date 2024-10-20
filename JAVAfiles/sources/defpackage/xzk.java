package defpackage;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xzk implements xzi {
    public static final uuf a = uuh.i(uuh.b, "enable_unredacted_phone_numbers_feedback_data", false);
    public final anen b;
    public final wul c;
    private final alwo d = alwo.o("Bugle");
    private final anen e;
    private final akbj f;

    public xzk(armf armfVar, anen anenVar, anen anenVar2) {
        this.e = anenVar;
        this.b = anenVar2;
        znj znjVar = (znj) armfVar.b();
        aiwl a2 = wus.a();
        a2.i(wuk.PII_LOG_BRIDGE);
        a2.k(xzj.a);
        this.c = znjVar.ab(a2.f());
        this.f = new akbj(new vbo(this, 10), anenVar2);
    }

    @Override // defpackage.xzi
    public final CharSequence a(CharSequence charSequence, int i) {
        String concat;
        if (((Boolean) a.e()).booleanValue() && this.f.c().isDone()) {
            if (i - 1 == 1) {
                try {
                    String str = (String) albo.bQ(this.f.c());
                    byte[] bArr = null;
                    if (charSequence == null) {
                        concat = null;
                    } else if (TextUtils.isEmpty(str)) {
                        concat = yyb.bh(charSequence);
                    } else {
                        int i2 = ambp.a;
                        concat = "Redacted-".concat(ambn.a.c(((String) charSequence).concat(String.valueOf(str)), StandardCharsets.UTF_8).toString());
                    }
                    aktp.ai(new xfb(charSequence, concat, 14, bArr), this.e).k(qiu.b(), this.b);
                    return concat;
                } catch (ExecutionException e) {
                    ((alwl) ((alwl) ((alwl) this.d.i()).g(e)).h("com/google/android/apps/messaging/shared/util/common/PiiLogBridgeImpl", "sanitizePii", 'q', "PiiLogBridgeImpl.java")).q("Failed to get salt for sanitize pii.");
                }
            }
            return yyb.bh(charSequence);
        }
        return yyb.bh(charSequence);
    }
}
