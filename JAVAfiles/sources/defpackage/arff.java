package defpackage;

import java.net.ProxySelector;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arff implements alhr {
    private final /* synthetic */ int a;

    public arff(int i) {
        this.a = i;
    }

    @Override // defpackage.alhr
    public final /* synthetic */ Object get() {
        if (this.a != 0) {
            return new alhp();
        }
        return ProxySelector.getDefault();
    }
}
