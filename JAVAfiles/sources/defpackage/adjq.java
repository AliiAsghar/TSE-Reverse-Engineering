package defpackage;

import com.google.android.ims.provisioning.config.Configuration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adjq implements armf {
    public volatile Configuration a;
    public volatile int b;

    public adjq(Configuration configuration, int i) {
        this.a = configuration;
        this.b = i;
    }

    public final void a(Configuration configuration, int i) {
        this.a = configuration;
        this.b = i;
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        return this.a;
    }
}
