package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import defpackage.a;
import defpackage.dz;
import defpackage.eb;
import defpackage.ed;
import defpackage.eg;
import defpackage.ei;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IMediaControllerCallback extends IInterface {
    public static final String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";

    void onCaptioningEnabledChanged(boolean z);

    void onEvent(String str, Bundle bundle);

    void onExtrasChanged(Bundle bundle);

    void onMetadataChanged(dz dzVar);

    void onPlaybackStateChanged(ei eiVar);

    void onQueueChanged(List<ed> list);

    void onQueueTitleChanged(CharSequence charSequence);

    void onRepeatModeChanged(int i);

    void onSessionDestroyed();

    void onSessionReady();

    void onShuffleModeChanged(int i);

    void onShuffleModeChangedRemoved(boolean z);

    void onVolumeInfoChanged(eg egVar);

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class Default implements IMediaControllerCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onSessionDestroyed() {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onSessionReady() {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onCaptioningEnabledChanged(boolean z) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onExtrasChanged(Bundle bundle) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onMetadataChanged(dz dzVar) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onPlaybackStateChanged(ei eiVar) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onQueueChanged(List<ed> list) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onQueueTitleChanged(CharSequence charSequence) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onRepeatModeChanged(int i) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onShuffleModeChanged(int i) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onShuffleModeChangedRemoved(boolean z) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onVolumeInfoChanged(eg egVar) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onEvent(String str, Bundle bundle) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IMediaControllerCallback {
        static final int TRANSACTION_onCaptioningEnabledChanged = 11;
        static final int TRANSACTION_onEvent = 1;
        static final int TRANSACTION_onExtrasChanged = 7;
        static final int TRANSACTION_onMetadataChanged = 4;
        static final int TRANSACTION_onPlaybackStateChanged = 3;
        static final int TRANSACTION_onQueueChanged = 5;
        static final int TRANSACTION_onQueueTitleChanged = 6;
        static final int TRANSACTION_onRepeatModeChanged = 9;
        static final int TRANSACTION_onSessionDestroyed = 2;
        static final int TRANSACTION_onSessionReady = 13;
        static final int TRANSACTION_onShuffleModeChanged = 12;
        static final int TRANSACTION_onShuffleModeChangedRemoved = 10;
        static final int TRANSACTION_onVolumeInfoChanged = 8;

        public Stub() {
            attachInterface(this, IMediaControllerCallback.DESCRIPTOR);
        }

        public static IMediaControllerCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IMediaControllerCallback.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IMediaControllerCallback)) {
                return (IMediaControllerCallback) queryLocalInterface;
            }
            return new eb(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i > 0 && i <= 16777215) {
                parcel.enforceInterface(IMediaControllerCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IMediaControllerCallback.DESCRIPTOR);
                return true;
            }
            boolean z = false;
            switch (i) {
                case 1:
                    onEvent(parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR));
                    return true;
                case 2:
                    onSessionDestroyed();
                    return true;
                case 3:
                    onPlaybackStateChanged((ei) a.d(parcel, ei.CREATOR));
                    return true;
                case 4:
                    onMetadataChanged((dz) a.d(parcel, dz.CREATOR));
                    return true;
                case 5:
                    onQueueChanged(parcel.createTypedArrayList(ed.CREATOR));
                    return true;
                case 6:
                    onQueueTitleChanged((CharSequence) a.d(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    return true;
                case 7:
                    onExtrasChanged((Bundle) a.d(parcel, Bundle.CREATOR));
                    return true;
                case 8:
                    onVolumeInfoChanged((eg) a.d(parcel, eg.CREATOR));
                    return true;
                case 9:
                    onRepeatModeChanged(parcel.readInt());
                    return true;
                case 10:
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    onShuffleModeChangedRemoved(z);
                    return true;
                case 11:
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    onCaptioningEnabledChanged(z);
                    return true;
                case 12:
                    onShuffleModeChanged(parcel.readInt());
                    return true;
                case 13:
                    onSessionReady();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
