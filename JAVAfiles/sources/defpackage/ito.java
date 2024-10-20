package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ito extends aker {
    final /* synthetic */ gpx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ito(gpx gpxVar, aksr aksrVar, Executor executor) {
        super(aksrVar, "ParticipantsObserver.ParticipantObserver#onChange", executor);
        this.a = gpxVar;
    }

    @Override // defpackage.aker
    public final void a(boolean z, Uri uri) {
        if (uri != null) {
            boolean equals = ruy.b(uri.getLastPathSegment()).equals(this.a.a);
            if (uri.getPathSegments().size() >= upb.p((Context) this.a.b).getPathSegments().size() + 1 && !equals) {
                return;
            }
            ((Optional) ((AtomicReference) this.a.d).get()).ifPresent(new isb(10));
        }
    }
}
