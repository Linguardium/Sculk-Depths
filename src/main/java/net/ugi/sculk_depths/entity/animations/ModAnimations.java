package net.ugi.sculk_depths.entity.animations;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class ModAnimations {

    public static final Animation GLOMPER_IDLE = Animation.Builder.create(1f).looping().build();
    public static final Animation LESTER_IDLE = Animation.Builder.create(2f).looping()
            .addBoneAnimation("head",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-2.5f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.5f, AnimationHelper.createRotationalVector(2.5f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR))).build();
    public static final Animation LESTER_WALK = Animation.Builder.create(1.2083433f).looping()
            .addBoneAnimation("head",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, AnimationHelper.createRotationalVector(0f, 5f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, AnimationHelper.createRotationalVector(-5f, 5f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, AnimationHelper.createRotationalVector(5f, 5f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.4583433f, AnimationHelper.createRotationalVector(5f, 5f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5416766f, AnimationHelper.createRotationalVector(-5f, 5f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.7083434f, AnimationHelper.createRotationalVector(-5f, 5f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.7916766f, AnimationHelper.createRotationalVector(5f, 5f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.9583434f, AnimationHelper.createRotationalVector(5f, 5f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.0416767f, AnimationHelper.createRotationalVector(-5f, 5f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.125f, AnimationHelper.createRotationalVector(0f, 5f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.1676667f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("L_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, AnimationHelper.createRotationalVector(20f, 10f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.4583433f, AnimationHelper.createRotationalVector(-20f, 10f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.7083434f, AnimationHelper.createRotationalVector(20f, 10f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.9583434f, AnimationHelper.createRotationalVector(-20f, 10f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.1676667f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("R_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, AnimationHelper.createRotationalVector(-30f, 10f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.4583433f, AnimationHelper.createRotationalVector(30f, 10f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.7083434f, AnimationHelper.createRotationalVector(-30f, 10f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.9583434f, AnimationHelper.createRotationalVector(30f, 10f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.1676667f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("body",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.08343333f, AnimationHelper.createRotationalVector(0f, -10f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, AnimationHelper.createRotationalVector(10f, -10f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.4583433f, AnimationHelper.createRotationalVector(-10f, -10f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.7083434f, AnimationHelper.createRotationalVector(10f, -10f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.9583434f, AnimationHelper.createRotationalVector(-10f, -10f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.0834333f, AnimationHelper.createRotationalVector(0f, -10f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.1676667f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR))).build();
}