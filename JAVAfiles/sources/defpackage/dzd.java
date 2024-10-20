package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return fo$$ExternalSyntheticApiModelOutline0.m(messagingStyle, message);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.MessagingStyle b(CharSequence charSequence) {
        return new Notification.MessagingStyle(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
        return fo$$ExternalSyntheticApiModelOutline0.m(messagingStyle, charSequence);
    }

    public static int d(Object obj) {
        int resId;
        if (Build.VERSION.SDK_INT >= 28) {
            resId = ((Icon) obj).getResId();
            return resId;
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    public static int e(Object obj) {
        int type;
        if (Build.VERSION.SDK_INT >= 28) {
            type = ((Icon) obj).getType();
            return type;
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Objects.toString(obj);
            Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e);
            return -1;
        } catch (NoSuchMethodException e2) {
            Objects.toString(obj);
            Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Objects.toString(obj);
            Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e3);
            return -1;
        }
    }

    public static Icon f(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        String str;
        int i = iconCompat.b;
        switch (i) {
            case -1:
                return (Icon) iconCompat.c;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.c);
                break;
            case 2:
                if (i == -1) {
                    str = i(iconCompat.c);
                } else if (i == 2) {
                    String str2 = iconCompat.k;
                    if (str2 != null && !TextUtils.isEmpty(str2)) {
                        str = iconCompat.k;
                    } else {
                        str = ((String) iconCompat.c).split(":", -1)[0];
                    }
                } else {
                    Objects.toString(iconCompat);
                    throw new IllegalStateException("called getResPackage() on ".concat(iconCompat.toString()));
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.f);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.c, iconCompat.f, iconCompat.g);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.c);
                break;
            case 5:
                createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.c);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = Icon.createWithAdaptiveBitmapContentUri(iconCompat.d());
                    break;
                } else if (context != null) {
                    Uri d = iconCompat.d();
                    String scheme = d.getScheme();
                    InputStream inputStream = null;
                    if (!"content".equals(scheme) && !"file".equals(scheme)) {
                        try {
                            inputStream = new FileInputStream(new File((String) iconCompat.c));
                        } catch (FileNotFoundException e) {
                            Objects.toString(d);
                            Log.w("IconCompat", "Unable to load image from path: ".concat(String.valueOf(d)), e);
                        }
                    } else {
                        try {
                            inputStream = context.getContentResolver().openInputStream(d);
                        } catch (Exception e2) {
                            Objects.toString(d);
                            Log.w("IconCompat", "Unable to load image from URI: ".concat(String.valueOf(d)), e2);
                        }
                    }
                    if (inputStream != null) {
                        createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStream));
                        break;
                    } else {
                        Uri d2 = iconCompat.d();
                        Objects.toString(d2);
                        throw new IllegalStateException("Cannot load adaptive icon from uri: ".concat(String.valueOf(d2)));
                    }
                } else {
                    Uri d3 = iconCompat.d();
                    Objects.toString(d3);
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: ".concat(String.valueOf(d3)));
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.i;
        if (mode != IconCompat.a) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public static Uri g(Object obj) {
        Uri uri;
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            }
        }
        uri = ((Icon) obj).getUri();
        return uri;
    }

    public static IconCompat h(Object obj) {
        dye.i(obj);
        int e = e(obj);
        if (e != 2) {
            if (e != 4) {
                if (e != 6) {
                    IconCompat iconCompat = new IconCompat(-1);
                    iconCompat.c = obj;
                    return iconCompat;
                }
                Uri g = g(obj);
                dyd.e(g);
                String uri = g.toString();
                dyd.e(uri);
                IconCompat iconCompat2 = new IconCompat(6);
                iconCompat2.c = uri;
                return iconCompat2;
            }
            Uri g2 = g(obj);
            dyd.e(g2);
            String uri2 = g2.toString();
            dyd.e(uri2);
            IconCompat iconCompat3 = new IconCompat(4);
            iconCompat3.c = uri2;
            return iconCompat3;
        }
        return IconCompat.h(null, i(obj), d(obj));
    }

    static String i(Object obj) {
        String resPackage;
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        }
        resPackage = ((Icon) obj).getResPackage();
        return resPackage;
    }

    public static final epd j(eoz eozVar) {
        if (eozVar instanceof enb) {
            return ((enb) eozVar).Q();
        }
        return epb.a;
    }
}
