package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import defpackage.hnu;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements hnu {
    private final InternalRewinder a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static final class InternalRewinder {
        private final ParcelFileDescriptor a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() {
            try {
                Os.lseek(this.a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean d() {
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hnu
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor a() {
        return this.a.rewind();
    }

    @Override // defpackage.hnu
    public final void b() {
    }
}
