package defpackage;

import com.google.android.libraries.places.api.net.kotlin.PlacesClientKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aich extends arps {
    public /* synthetic */ Object a;
    public int b;

    public aich(arpe arpeVar) {
        super(arpeVar);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return PlacesClientKt.awaitFindCurrentPlace(null, null, this);
    }
}
