package defpackage;

import android.app.Notification;
import android.graphics.drawable.Drawable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.Style a() {
        return new Notification.DecoratedCustomViewStyle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable b(Drawable drawable) {
        if (drawable instanceof ebc) {
            return ((ebc) drawable).a();
        }
        return drawable;
    }

    public static final eor c(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            newInstance.getClass();
            return (eor) newInstance;
        } catch (IllegalAccessException e) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
        } catch (NoSuchMethodException e3) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        }
    }

    public static final eor d(eov eovVar, artf artfVar, epd epdVar) {
        try {
            try {
                return eovVar.c(artfVar, epdVar);
            } catch (AbstractMethodError unused) {
                return eovVar.b(armd.d(artfVar), epdVar);
            }
        } catch (AbstractMethodError unused2) {
            return eovVar.a(armd.d(artfVar));
        }
    }
}
