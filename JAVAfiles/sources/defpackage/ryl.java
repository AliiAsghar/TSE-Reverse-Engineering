package defpackage;

import android.net.Uri;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ryl extends aker {
    final /* synthetic */ rym a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryl(rym rymVar, aksr aksrVar) {
        super(aksrVar, "ShareRecentImageSuggestionGenerator.Observer#onChange", andi.a);
        this.a = rymVar;
    }

    @Override // defpackage.aker
    public final void a(boolean z, Uri uri) {
        if (uri != null) {
            Set set = this.a.a;
            String uri2 = uri.toString();
            if (set.add(uri2)) {
                rym rymVar = this.a;
                rymVar.b.a(rymVar.c, uri2, rymVar.d, rymVar.a);
            }
        }
    }
}
