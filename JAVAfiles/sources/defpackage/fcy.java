package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcy implements fcq {
    /* JADX INFO: Access modifiers changed from: protected */
    public static int a(int i, int i2, int i3) {
        return albo.co(((i * i2) * i3) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int b(int i) {
        if (i != 20) {
            if (i != 30) {
                switch (i) {
                    case 5:
                        return 80000;
                    case 6:
                        return 768000;
                    case 7:
                        return 192000;
                    case 8:
                        return 2250000;
                    case 9:
                        return 40000;
                    case 10:
                        return 100000;
                    case 11:
                        return 16000;
                    case 12:
                        return 7000;
                    default:
                        switch (i) {
                            case 14:
                                return 3062500;
                            case 15:
                                return 8000;
                            case 16:
                                return 256000;
                            case 17:
                                return 336000;
                            case 18:
                                return 768000;
                            default:
                                throw new IllegalArgumentException();
                        }
                }
            }
            return 2250000;
        }
        return 63750;
    }
}
