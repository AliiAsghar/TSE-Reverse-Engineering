package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum ajvz {
    CONFIG_DEFAULT(ajus.CONFIG_PROGRESS_ILLUSTRATION_DEFAULT),
    CONFIG_ACCOUNT(ajus.CONFIG_PROGRESS_ILLUSTRATION_ACCOUNT),
    CONFIG_CONNECTION(ajus.CONFIG_PROGRESS_ILLUSTRATION_CONNECTION),
    CONFIG_UPDATE(ajus.CONFIG_PROGRESS_ILLUSTRATION_UPDATE);

    ajvz(ajus ajusVar) {
        if (ajusVar.bz == 8) {
        } else {
            throw new IllegalArgumentException("Illustration progress only allow illustration resource");
        }
    }
}
