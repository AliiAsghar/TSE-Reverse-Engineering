package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxj {
    public String a;
    public Uri b;
    public aggp c;
    public Duration d;
    public mvy e;
    public myz f;

    public final void a(aggp aggpVar) {
        if (aggpVar != null) {
            this.c = aggpVar;
            return;
        }
        throw new NullPointerException("Null voiceMetadata");
    }
}
