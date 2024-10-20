package defpackage;

import com.google.android.libraries.places.api.net.kotlin.PlacesClientKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aicf extends arps {
    public /* synthetic */ Object a;
    public int b;

    public aicf(arpe arpeVar) {
        super(arpeVar);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return PlacesClientKt.awaitFetchResolvedPhotoUri(null, null, null, this);
    }
}
