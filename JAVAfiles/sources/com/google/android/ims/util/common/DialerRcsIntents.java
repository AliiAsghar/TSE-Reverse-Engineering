package com.google.android.ims.util.common;

import defpackage.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DialerRcsIntents {
    public static final String ACTION_CALL_CAPABILITIES_UPDATE = "dialer.rcs.intent.action.callCapabilitiesUpdate";
    public static final String ACTION_INCOMING_CALL_COMPOSER_MESSAGE = "dialer.rcs.intent.action.incomingCallComposerMessage";
    public static final String ACTION_INCOMING_PICTURE_MESSAGE = "dialer.rcs.intent.action.incomingPictureMessage";
    public static final String ACTION_INCOMING_VIDEO_SHARE = "dialer.rcs.intent.action.incomingVideoShare";
    public static final String ACTION_MESSAGE_STATUS_UPDATE = "dialer.rcs.intent.action.messageStatusUpdate";
    public static final String ACTION_SESSION_STATUS_UPDATE = "dialer.rcs.intent.action.sessionStatusUpdate";
    public static final String EXTRA_CALL_COMPOSER_SUPPORTED = "rcs.intent.extra.callComposerSupported";
    public static final String EXTRA_CODEC = "rcs.intent.extra.codec";
    public static final String EXTRA_HEIGHT = "rcs.intent.extra.height";
    public static final String EXTRA_IS_TEMPORARILY_OFFLINE = "rcs.intent.extra.temporarilyOffline";
    public static final String EXTRA_ORIENTATION = "rcs.intent.extra.orientation";
    public static final String EXTRA_POST_CALL_SUPPORTED = "rcs.intent.extra.postCallSupported";
    public static final String EXTRA_VIDEO_SHARE_SUPPORTED = "rcs.intent.extra.videoShareSupported";
    public static final String EXTRA_WIDTH = "rcs.intent.extra.width";
    public static final int MESSAGE_STATE_FAILED = 5;
    public static final int MESSAGE_STATE_SENT = 4;
    public static final int SESSION_STATE_CLOSED = 3;
    public static final int SESSION_STATE_STARTED = 2;
    public static final int SESSION_STATE_STARTING = 0;
    public static final int SESSION_STATE_START_FAILED = 1;

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface MessageState {
    }

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface SessionState {
    }

    public static boolean isMessageState(int i) {
        if (i != 4 && i != 5) {
            return false;
        }
        return true;
    }

    public static boolean isSessionState(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public static String messageStateToString(int i) {
        if (i != 4) {
            if (i == 5) {
                return "MESSAGE_STATE_FAILED";
            }
            throw new IllegalArgumentException(a.bV(i, "Unrecognized messageState: "));
        }
        return "MESSAGE_STATE_SENT";
    }

    public static String sessionStateToString(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "SESSION_STATE_CLOSED";
                    }
                    throw new IllegalArgumentException(a.bV(i, "Unrecognized sessionState: "));
                }
                return "SESSION_STATE_STARTED";
            }
            return "SESSION_STATE_START_FAILED";
        }
        return "SESSION_STATE_STARTING";
    }
}
