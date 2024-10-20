package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.IMediaControllerCallback;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eb implements IMediaControllerCallback {
    private final IBinder a;

    public eb(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onCaptioningEnabledChanged(boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeInt(z ? 1 : 0);
            this.a.transact(11, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onEvent(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeString(str);
            ef.c(obtain, bundle);
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onExtrasChanged(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            ef.c(obtain, bundle);
            this.a.transact(7, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onMetadataChanged(dz dzVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            ef.c(obtain, dzVar);
            this.a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onPlaybackStateChanged(ei eiVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            ef.c(obtain, eiVar);
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onQueueChanged(List<ed> list) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (list == null) {
                obtain.writeInt(-1);
            } else {
                int size = list.size();
                obtain.writeInt(size);
                for (int i = 0; i < size; i++) {
                    ef.c(obtain, list.get(i));
                }
            }
            this.a.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (charSequence != null) {
                obtain.writeInt(1);
                TextUtils.writeToParcel(charSequence, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(6, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onRepeatModeChanged(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeInt(i);
            this.a.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onSessionDestroyed() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onSessionReady() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            this.a.transact(13, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onShuffleModeChanged(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeInt(i);
            this.a.transact(12, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onShuffleModeChangedRemoved(boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeInt(z ? 1 : 0);
            this.a.transact(10, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onVolumeInfoChanged(eg egVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            ef.c(obtain, egVar);
            this.a.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
