package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlk extends hli {
    public hlk(Class cls, Class cls2) {
        super(a.bY(cls2, cls, "Failed to find any ModelLoaders for model: ", " and data: "));
    }

    public hlk(Object obj) {
        super("Failed to find any ModelLoaders registered for model class: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public hlk(Object obj, List list) {
        super(a.ct(obj, list, "Found ModelLoaders for model class: ", ", but none that handle this specific model instance: "));
    }
}
