package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.session.IMediaControllerCallback;
import android.text.TextUtils;
import android.view.KeyEvent;
import defpackage.a;
import defpackage.dy;
import defpackage.dz;
import defpackage.ea;
import defpackage.ec;
import defpackage.ed;
import defpackage.ee;
import defpackage.eg;
import defpackage.ei;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IMediaSession extends IInterface {
    public static final String DESCRIPTOR = "android.support.v4.media.session.IMediaSession";

    void addQueueItem(dy dyVar);

    void addQueueItemAt(dy dyVar, int i);

    void adjustVolume(int i, int i2, String str);

    void fastForward();

    Bundle getExtras();

    long getFlags();

    PendingIntent getLaunchPendingIntent();

    dz getMetadata();

    String getPackageName();

    ei getPlaybackState();

    List<ed> getQueue();

    CharSequence getQueueTitle();

    int getRatingType();

    int getRepeatMode();

    Bundle getSessionInfo();

    int getShuffleMode();

    String getTag();

    eg getVolumeAttributes();

    boolean isCaptioningEnabled();

    boolean isShuffleModeEnabledRemoved();

    boolean isTransportControlEnabled();

    void next();

    void pause();

    void play();

    void playFromMediaId(String str, Bundle bundle);

    void playFromSearch(String str, Bundle bundle);

    void playFromUri(Uri uri, Bundle bundle);

    void prepare();

    void prepareFromMediaId(String str, Bundle bundle);

    void prepareFromSearch(String str, Bundle bundle);

    void prepareFromUri(Uri uri, Bundle bundle);

    void previous();

    void rate(ea eaVar);

    void rateWithExtras(ea eaVar, Bundle bundle);

    void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback);

    void removeQueueItem(dy dyVar);

    void removeQueueItemAt(int i);

    void rewind();

    void seekTo(long j);

    void sendCommand(String str, Bundle bundle, ee eeVar);

    void sendCustomAction(String str, Bundle bundle);

    boolean sendMediaButton(KeyEvent keyEvent);

    void setCaptioningEnabled(boolean z);

    void setPlaybackSpeed(float f);

    void setRepeatMode(int i);

    void setShuffleMode(int i);

    void setShuffleModeEnabledRemoved(boolean z);

    void setVolumeTo(int i, int i2, String str);

    void skipToQueueItem(long j);

    void stop();

    void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback);

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class Default implements IMediaSession {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public Bundle getExtras() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public long getFlags() {
            return 0L;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public PendingIntent getLaunchPendingIntent() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public dz getMetadata() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public String getPackageName() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public ei getPlaybackState() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public List<ed> getQueue() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public CharSequence getQueueTitle() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public int getRatingType() {
            return 0;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public int getRepeatMode() {
            return 0;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public Bundle getSessionInfo() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public int getShuffleMode() {
            return 0;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public String getTag() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public eg getVolumeAttributes() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean isCaptioningEnabled() {
            return false;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean isShuffleModeEnabledRemoved() {
            return false;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean isTransportControlEnabled() {
            return false;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean sendMediaButton(KeyEvent keyEvent) {
            return false;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void fastForward() {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void next() {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void pause() {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void play() {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void prepare() {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void previous() {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void rewind() {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void stop() {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void addQueueItem(dy dyVar) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void rate(ea eaVar) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void removeQueueItem(dy dyVar) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void removeQueueItemAt(int i) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void seekTo(long j) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setCaptioningEnabled(boolean z) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setPlaybackSpeed(float f) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setRepeatMode(int i) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setShuffleMode(int i) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setShuffleModeEnabledRemoved(boolean z) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void skipToQueueItem(long j) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void addQueueItemAt(dy dyVar, int i) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void playFromMediaId(String str, Bundle bundle) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void playFromSearch(String str, Bundle bundle) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void playFromUri(Uri uri, Bundle bundle) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void prepareFromMediaId(String str, Bundle bundle) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void prepareFromSearch(String str, Bundle bundle) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void prepareFromUri(Uri uri, Bundle bundle) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void rateWithExtras(ea eaVar, Bundle bundle) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void sendCustomAction(String str, Bundle bundle) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void adjustVolume(int i, int i2, String str) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void sendCommand(String str, Bundle bundle, ee eeVar) {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setVolumeTo(int i, int i2, String str) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IMediaSession {
        static final int TRANSACTION_addQueueItem = 41;
        static final int TRANSACTION_addQueueItemAt = 42;
        static final int TRANSACTION_adjustVolume = 11;
        static final int TRANSACTION_fastForward = 22;
        static final int TRANSACTION_getExtras = 31;
        static final int TRANSACTION_getFlags = 9;
        static final int TRANSACTION_getLaunchPendingIntent = 8;
        static final int TRANSACTION_getMetadata = 27;
        static final int TRANSACTION_getPackageName = 6;
        static final int TRANSACTION_getPlaybackState = 28;
        static final int TRANSACTION_getQueue = 29;
        static final int TRANSACTION_getQueueTitle = 30;
        static final int TRANSACTION_getRatingType = 32;
        static final int TRANSACTION_getRepeatMode = 37;
        static final int TRANSACTION_getSessionInfo = 50;
        static final int TRANSACTION_getShuffleMode = 47;
        static final int TRANSACTION_getTag = 7;
        static final int TRANSACTION_getVolumeAttributes = 10;
        static final int TRANSACTION_isCaptioningEnabled = 45;
        static final int TRANSACTION_isShuffleModeEnabledRemoved = 38;
        static final int TRANSACTION_isTransportControlEnabled = 5;
        static final int TRANSACTION_next = 20;
        static final int TRANSACTION_pause = 18;
        static final int TRANSACTION_play = 13;
        static final int TRANSACTION_playFromMediaId = 14;
        static final int TRANSACTION_playFromSearch = 15;
        static final int TRANSACTION_playFromUri = 16;
        static final int TRANSACTION_prepare = 33;
        static final int TRANSACTION_prepareFromMediaId = 34;
        static final int TRANSACTION_prepareFromSearch = 35;
        static final int TRANSACTION_prepareFromUri = 36;
        static final int TRANSACTION_previous = 21;
        static final int TRANSACTION_rate = 25;
        static final int TRANSACTION_rateWithExtras = 51;
        static final int TRANSACTION_registerCallbackListener = 3;
        static final int TRANSACTION_removeQueueItem = 43;
        static final int TRANSACTION_removeQueueItemAt = 44;
        static final int TRANSACTION_rewind = 23;
        static final int TRANSACTION_seekTo = 24;
        static final int TRANSACTION_sendCommand = 1;
        static final int TRANSACTION_sendCustomAction = 26;
        static final int TRANSACTION_sendMediaButton = 2;
        static final int TRANSACTION_setCaptioningEnabled = 46;
        static final int TRANSACTION_setPlaybackSpeed = 49;
        static final int TRANSACTION_setRepeatMode = 39;
        static final int TRANSACTION_setShuffleMode = 48;
        static final int TRANSACTION_setShuffleModeEnabledRemoved = 40;
        static final int TRANSACTION_setVolumeTo = 12;
        static final int TRANSACTION_skipToQueueItem = 17;
        static final int TRANSACTION_stop = 19;
        static final int TRANSACTION_unregisterCallbackListener = 4;

        public Stub() {
            attachInterface(this, IMediaSession.DESCRIPTOR);
        }

        public static IMediaSession asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IMediaSession.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IMediaSession)) {
                return (IMediaSession) queryLocalInterface;
            }
            return new ec(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i > 0 && i <= 16777215) {
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IMediaSession.DESCRIPTOR);
                return true;
            }
            boolean z = false;
            boolean z2 = false;
            switch (i) {
                case 1:
                    sendCommand(parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR), (ee) a.d(parcel, ee.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    boolean sendMediaButton = sendMediaButton((KeyEvent) a.d(parcel, KeyEvent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(sendMediaButton ? 1 : 0);
                    return true;
                case 3:
                    registerCallbackListener(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    unregisterCallbackListener(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    boolean isTransportControlEnabled = isTransportControlEnabled();
                    parcel2.writeNoException();
                    parcel2.writeInt(isTransportControlEnabled ? 1 : 0);
                    return true;
                case 6:
                    String packageName = getPackageName();
                    parcel2.writeNoException();
                    parcel2.writeString(packageName);
                    return true;
                case 7:
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 8:
                    PendingIntent launchPendingIntent = getLaunchPendingIntent();
                    parcel2.writeNoException();
                    a.e(parcel2, launchPendingIntent, 1);
                    return true;
                case 9:
                    long flags = getFlags();
                    parcel2.writeNoException();
                    parcel2.writeLong(flags);
                    return true;
                case 10:
                    eg volumeAttributes = getVolumeAttributes();
                    parcel2.writeNoException();
                    a.e(parcel2, volumeAttributes, 1);
                    return true;
                case 11:
                    adjustVolume(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    setVolumeTo(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    play();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    playFromMediaId(parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    playFromSearch(parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    playFromUri((Uri) a.d(parcel, Uri.CREATOR), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    skipToQueueItem(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    fastForward();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    rewind();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    seekTo(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    rate((ea) a.d(parcel, ea.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    sendCustomAction(parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    dz metadata = getMetadata();
                    parcel2.writeNoException();
                    a.e(parcel2, metadata, 1);
                    return true;
                case 28:
                    ei playbackState = getPlaybackState();
                    parcel2.writeNoException();
                    a.e(parcel2, playbackState, 1);
                    return true;
                case 29:
                    List<ed> queue = getQueue();
                    parcel2.writeNoException();
                    if (queue == null) {
                        parcel2.writeInt(-1);
                    } else {
                        int size = queue.size();
                        parcel2.writeInt(size);
                        for (int i3 = 0; i3 < size; i3++) {
                            a.e(parcel2, queue.get(i3), 1);
                        }
                    }
                    return true;
                case 30:
                    CharSequence queueTitle = getQueueTitle();
                    parcel2.writeNoException();
                    if (queueTitle != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(queueTitle, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    Bundle extras = getExtras();
                    parcel2.writeNoException();
                    a.e(parcel2, extras, 1);
                    return true;
                case 32:
                    int ratingType = getRatingType();
                    parcel2.writeNoException();
                    parcel2.writeInt(ratingType);
                    return true;
                case 33:
                    prepare();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    prepareFromMediaId(parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    prepareFromSearch(parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 36:
                    prepareFromUri((Uri) a.d(parcel, Uri.CREATOR), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    int repeatMode = getRepeatMode();
                    parcel2.writeNoException();
                    parcel2.writeInt(repeatMode);
                    return true;
                case 38:
                    boolean isShuffleModeEnabledRemoved = isShuffleModeEnabledRemoved();
                    parcel2.writeNoException();
                    parcel2.writeInt(isShuffleModeEnabledRemoved ? 1 : 0);
                    return true;
                case TRANSACTION_setRepeatMode /* 39 */:
                    setRepeatMode(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    }
                    setShuffleModeEnabledRemoved(z2);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    addQueueItem((dy) a.d(parcel, dy.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    addQueueItemAt((dy) a.d(parcel, dy.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    removeQueueItem((dy) a.d(parcel, dy.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 44:
                    removeQueueItemAt(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    boolean isCaptioningEnabled = isCaptioningEnabled();
                    parcel2.writeNoException();
                    parcel2.writeInt(isCaptioningEnabled ? 1 : 0);
                    return true;
                case 46:
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    setCaptioningEnabled(z);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    int shuffleMode = getShuffleMode();
                    parcel2.writeNoException();
                    parcel2.writeInt(shuffleMode);
                    return true;
                case TRANSACTION_setShuffleMode /* 48 */:
                    setShuffleMode(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_setPlaybackSpeed /* 49 */:
                    setPlaybackSpeed(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getSessionInfo /* 50 */:
                    Bundle sessionInfo = getSessionInfo();
                    parcel2.writeNoException();
                    a.e(parcel2, sessionInfo, 1);
                    return true;
                case TRANSACTION_rateWithExtras /* 51 */:
                    rateWithExtras((ea) a.d(parcel, ea.CREATOR), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
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
