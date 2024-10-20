package defpackage;

import android.text.SpannableStringBuilder;
import com.google.android.apps.messaging.datadonation.redact.RedactedSpan;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klg implements klf {
    private final /* synthetic */ int a;

    public klg(int i) {
        this.a = i;
    }

    @Override // defpackage.klf
    public final void a(SpannableStringBuilder spannableStringBuilder) {
        if (this.a != 0) {
            RedactedSpan.b(spannableStringBuilder, kle.EMAIL, "•••@•••.•••");
        } else {
            RedactedSpan.b(spannableStringBuilder, kle.URL, "•••.•••");
        }
    }
}
