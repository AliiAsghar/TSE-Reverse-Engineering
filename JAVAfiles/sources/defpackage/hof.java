package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hof implements hnt {
    @Override // defpackage.hnt
    public final /* synthetic */ hnu a(Object obj) {
        return new ParcelFileDescriptorRewinder((ParcelFileDescriptor) obj);
    }

    @Override // defpackage.hnt
    public final Class b() {
        return ParcelFileDescriptor.class;
    }
}
