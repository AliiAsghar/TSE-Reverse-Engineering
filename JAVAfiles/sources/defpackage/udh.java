package defpackage;

import android.os.StrictMode$OnThreadViolationListener;
import android.os.strictmode.Violation;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class udh implements StrictMode$OnThreadViolationListener {
    final /* synthetic */ udi a;

    public udh(udi udiVar) {
        this.a = udiVar;
    }

    public final void onThreadViolation(Violation violation) {
        String str;
        boolean z;
        String message;
        Object obj;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace != null) {
            loop0: for (StackTraceElement stackTraceElement : stackTrace) {
                String stackTraceElement2 = stackTraceElement.toString();
                alpr alprVar = new alpr();
                alprVar.i(udg.a);
                aluq listIterator = alprVar.g().listIterator();
                while (listIterator.hasNext()) {
                    str = (String) listIterator.next();
                    if (stackTraceElement2.contains(str)) {
                        z = true;
                        break loop0;
                    }
                }
            }
        }
        str = "";
        z = false;
        if (!z) {
            alvw i = udi.a.i();
            i.X(alwp.a, "strictmode_in_txn");
            alvg alvgVar = (alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "strictmodeViolationCallback", 78, "Post29PolicyMaker.java");
            String str2 = null;
            if (violation != null) {
                message = violation.getMessage();
            } else {
                message = null;
            }
            alvgVar.t("violation %s", message);
            if (stackTrace != null) {
                for (StackTraceElement stackTraceElement3 : stackTrace) {
                    alvw i2 = udi.a.i();
                    i2.X(alwp.a, "strictmode_in_txn");
                    ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "strictmodeViolationCallback", 81, "Post29PolicyMaker.java")).t("   %s", stackTraceElement3);
                }
            }
            wpp wppVar = (wpp) ((Stack) this.a.b.get()).peek();
            if (wppVar != null) {
                obj = wppVar.a;
            } else {
                obj = new StackTraceElement[0];
            }
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj;
            if (stackTraceElementArr.length > 0) {
                alvw i3 = udi.a.i();
                i3.X(alwp.a, "strictmode_in_txn");
                ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "logCurrentOutermostTransactionStackOnThisThread", 106, "Post29PolicyMaker.java")).q("transaction was acquired here: ");
                for (StackTraceElement stackTraceElement4 : stackTraceElementArr) {
                    alvw i4 = udi.a.i();
                    i4.X(alwp.a, "strictmode_in_txn");
                    ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "logCurrentOutermostTransactionStackOnThisThread", 108, "Post29PolicyMaker.java")).t("   %s", stackTraceElement4);
                }
            } else {
                alvw i5 = udi.a.i();
                i5.X(alwp.a, "strictmode_in_txn");
                ((alvg) ((alvg) i5).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "logCurrentOutermostTransactionStackOnThisThread", 111, "Post29PolicyMaker.java")).q("unknown where transaction was acquired.  Running logging outside of transaction?");
            }
            if (violation != null) {
                str2 = violation.getClass().getSimpleName();
            }
            qiu.d(new AssertionError("StrictMode violation while in a transaction: ".concat(String.valueOf(str2))));
            return;
        }
        alvw i6 = udi.a.i();
        i6.X(alwp.a, "strictmode_in_txn");
        ((alvg) ((alvg) i6).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "strictmodeViolationCallback", 91, "Post29PolicyMaker.java")).t("exempted by %s", str);
    }
}
