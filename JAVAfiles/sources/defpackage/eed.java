package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eed {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static CharSequence a(View view) {
        CharSequence accessibilityPaneTitle;
        accessibilityPaneTitle = view.getAccessibilityPaneTitle();
        return accessibilityPaneTitle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T b(View view, int i) {
        KeyEvent.Callback requireViewById;
        requireViewById = view.requireViewById(i);
        return (T) requireViewById;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(View view) {
        boolean isAccessibilityHeading;
        isAccessibilityHeading = view.isAccessibilityHeading();
        return isAccessibilityHeading;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(View view) {
        boolean isScreenReaderFocusable;
        isScreenReaderFocusable = view.isScreenReaderFocusable();
        return isScreenReaderFocusable;
    }

    public static void h(Surface surface, float f) {
        int i;
        if (f == brg.a) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            surface.setFrameRate(f, i);
        } catch (IllegalStateException e) {
            eub.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public static boolean i(Context context) {
        Display display;
        boolean isHdr;
        Display.HdrCapabilities hdrCapabilities;
        int[] supportedHdrTypes;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            return false;
        }
        isHdr = display.isHdr();
        if (!isHdr) {
            return false;
        }
        hdrCapabilities = display.getHdrCapabilities();
        supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
        for (int i : supportedHdrTypes) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
