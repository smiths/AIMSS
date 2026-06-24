## https://github.com/knmcguire/best-of-robot-simulators
Skip to content
Navigation Menu
Platform
Solutions
Resources
Open Source
Enterprise
Pricing

Search or jump to...
Sign in
Sign up
knmcguire
/
best-of-robot-simulators
Public
generated from best-of-lists/best-of
Code
Issues
13
Pull requests
Actions
Projects
Security
Insights
knmcguire/best-of-robot-simulators
Go to file
Name		
github-actions[bot]knmcguire
github-actions[bot]
and
knmcguire
Update best-of list for version 2025.11.12 (#224)
d5129d7
 · 
2 days ago
.github
Add PR ci check (#145)
6 months ago
config
adds mjlab (#217)
last month
history
Update best-of list for version 2025.11.12 (#224)
2 days ago
.gitignore
Initial commit
7 months ago
CONTRIBUTING.md
Initial setup for best-of list
7 months ago
LICENSE
Initial commit
7 months ago
README.md
Update best-of list for version 2025.11.12 (#224)
2 days ago
latest-changes.md
Update best-of list for version 2025.11.12 (#224)
2 days ago
projects.yaml
Add Crazyflow project to projects.yaml (#223)
5 days ago
Repository files navigation
README
Code of conduct
Contributing
CC-BY-SA-4.0 license
best-of-robot-simulators
🏆  A ranked list of awesome projects. Updated weekly.

   

This curated list contains 170 awesome simulator projects with a total of 430K stars grouped into 11 categories. All projects are ranked by a project-quality score, which is calculated based on various metrics automatically collected from GitHub and different package managers. If you like to add or update projects, feel free to open an issue, submit a pull request, or directly edit the projects.yaml. Contributions are very welcome!

🧙‍♂️ Discover other best-of lists or create your own.

Definition Robotics Simulator
Here is a definition of a robotics simulator derived in this blogpost

A robotic simulator is a software framework that provides a virtual environment, often leveraging different physics/rendering engines and sensor models, to model the robot's behavior, its interaction and perception with the simulated world for design, evaluative or data-generative purposes.

With:

virtual environment - To provide the scenario for the simulated robot to act in, depending on the application, like an indoor building, forest, or lunar landscape.
behavior, its interaction and perception - The simulated entity should be able to interact with and act upon that virtual environment or world through its simulated sensors and actuators.
physics/rendering engines and sensor models - To be able to simulate those interactions and perceptions caused by the robot's behavior, to model how an object will slip while being grasped or the noise of the lidar ranges.
design, evaluative or data-generative - To use this as a development tool, as part of continuous integration to assure quality, or to collect data that can be used for AI training purposes.
Contents
Generic Robotics Simulators 23 projects
Robotic simulators in 2D 5 projects
Aerial Robotics Simulators 29 projects
Maritime Robotics Simulators 19 projects
Automotive Simulators 5 projects
Space Robotics Simulators 6 projects
AI training Simulators 34 projects
Other Domain Specific Simulators 9 projects
Game engines 6 projects
Physics Engines 22 projects
Rendering engines 7 projects
Others 1 projects
Explanation
🥇🥈🥉  Combined project-quality score
⭐️  Star count from GitHub
🐣  New project (less than 6 months old)
💤  Inactive project (12 months no activity)
💀  Dead project (999999 months no activity)
📈📉  Project is trending up or down
➕  Project was recently added
👨‍💻  Contributors count from GitHub
🔀  Fork count from GitHub
📋  Issue count from GitHub
⏱️  Last update timestamp on package manager
📥  Download count from package manager
📦  Number of dependent projects

Generic Robotics Simulators
Back to top

Generic simulators, tools or SDKs made for robotics

mujoco (🥇38 · ⭐ 11K) - Multi-Joint dynamics with Contact. A general purpose physics simulator. Apache-2
O3DE for Robotics (🥇29 · ⭐ 8.7K) - Open 3D Engine (O3DE) is an Apache 2.0-licensed multi-platform 3D engine that enables developers and content creators.. MIT and Apache-2
Webots (🥇28 · ⭐ 3.9K · 📈) - Webots Robot Simulator. Apache-2
Gazebo (🥈23 · ⭐ 1.1K) - Open source robotics simulator. The latest version of Gazebo. Apache-2
Newton (Physics) (🥈21 · ⭐ 2K) - An open-source, GPU-accelerated physics simulation engine built upon NVIDIA Warp, specifically targeting roboticists.. Apache-2
OpenRAVE (🥈18 · ⭐ 790 · 💤) - Open Robotics Automation Virtual Environment: An environment for testing, developing, and deploying robotics motion.. Apache-2 and LGPL-3
Unity Robotics Hub (🥈16 · ⭐ 2.4K) - Central repository for tools, tutorials, resources, and documentation for robotics simulation in Unity. Apache-2
NVIDIA Isaac Sim (🥈16 · ⭐ 1.9K · 🐣) - NVIDIA Isaac Sim is an open-source application on NVIDIA Omniverse for developing, simulating, and testing AI-driven.. Apache 2.0 and NVIDIA Omniverse License Agreement
Ros2 For Unity (🥉15 · ⭐ 590 · 💤) - High-performance ROS2 solution for Unity3D. Apache-2
ARGoS (🥉15 · ⭐ 290) - A parallel, multi-engine simulator for heterogeneous swarm robotics. MIT
ROS1 Intergration for Unreal 4 (🥉14 · ⭐ 450) - Unreal Engine Plugin to enable ROS Support. MIT
CoppeliaSim core library (🥉11 · ⭐ 130) - CoppeliaSim core library. gnu-gpl
Robwork (🥉8 · ⭐ 33 · 💤) - RobWork is a collection of C++ libraries for simulation and control of robot systems, see http://robwork.dk To get.. Apache-2
SimSpark (🥉7 · ⭐ 21) - A generic physical simulator. Missing
CoppeliaSim (🥉1) - Proprietary Software License
RobotBuilder (🥉1) - Commercial software
RoboDK (🥉1) - proprietary license
MATLAB Robotics Systems Toolbox (🥉1) - Proprietary Software License
RoSi (🥉1) - Proprietary Software License
Show 4 hidden projects...

Robotic simulators in 2D
Back to top

Robotic simulators that only work in a 2D environment, for instance navigation

IR-SIM (🥇23 · ⭐ 620) - A Python based lightweight robot simulator for the development of algorithms in robotics navigation, control, and.. MIT
pyrobosim (🥈20 · ⭐ 360) - ROS 2 enabled 2D mobile robot simulator for behavior prototyping. MIT
mvsim (🥉16 · ⭐ 350) - Vehicle and mobile robotics simulator. C++ & Python API. Use it as a standalone application or via ROS 1 or ROS 2. BSD-3
Flatland (🥉13 · ⭐ 120 · 💤) - A 2D robot simulator for ROS. BSD-3
DWA_Algorithm_PYTHON (🥉4 · ⭐ 11 · 🐣) - A fully visualized implementation of the Dynamic Window Approach (DWA) in Python using Pygame. Simulate and visualize.. MIT

Aerial Robotics Simulators
Back to top

Simulator frameworks made especially for aerial robotics

Colosseum (🥇23 · ⭐ 550) - Open source simulator for autonomous robotics built on Unreal Engine with support for Unity. MIT
Cosys-AirSim (🥇20 · ⭐ 250) - AirSim is a simulator for drones, cars and more, built on Unreal Engine. We expand it with new implementations and.. MIT
PyFlyt (🥈19 · ⭐ 200) - UAV Flight Simulator for Reinforcement Learning Research. MIT
Gym Pybullet Drones (🥈18 · ⭐ 1.7K) - PyBullet Gymnasium environments for single and multi-agent reinforcement learning of quadcopter control. MIT
RotorS (🥈18 · ⭐ 1.4K · 💤) - RotorS is a UAV gazebo simulator. MIT
Flightmare (🥈17 · ⭐ 1.2K · 💤) - An Open Flexible Quadrotor Simulator. MIT
Pegasus Simulator (🥈16 · ⭐ 620) - A framework built on top of NVIDIA Isaac Sim for simulating drones with PX4 support and much more. BSD-3
Project AirSim (🥈16 · ⭐ 330 · 🐣) - Project AirSim is Microsofts evolution of AirSim, an advanced simulation platform for building, training, and testing.. MIT
FlightGoggles (🥈15 · ⭐ 430 · 💤) - A framework for photorealistic hardware-in-the-loop agile flight simulation using Unity3D and ROS. Developed by MIT.. MIT
rotorpy (🥈15 · ⭐ 200) - A multirotor simulator with aerodynamics for education and research. MIT
Aerial Gym Simulator (🥈14 · ⭐ 600) - Aerial Gym Simulator - Isaac Gym Simulator for Aerial Robots. BSD-3
jMAVSim (🥈14 · ⭐ 97 · 💤) - Simple multirotor simulator with MAVLink protocol support. BSD-3
Crazyflow (🥈14 · ⭐ 42 · ➕) - Scalable Crazyflie simulation using JAX. MIT
Gymfc (🥉13 · ⭐ 440 · 💤) - A universal flight control tuning framework. MIT
CrazyS (🥉13 · ⭐ 180 · 💤) - CrazyS is an extension of the ROS package RotorS, aimed to modeling, developing and integrating the Crazyflie 2.0. Apache-2
Isaac Drone Racer (🥉9 · ⭐ 140 · 🐣) - Isaac Drone Racer is a reinforcement learning framework for high speed autonomous drone racing, built on top of.. BSD-3
Fly Craft (🥉8 · ⭐ 89) - An efficient goal-conditioned reinforcement learning environment for fixed-wing UAV velocity vector control based on.. MIT
Flightgear (🥉8 · ⭐ 58 · 💤) - FlightGear open-source flight simulator [flightgear.org](https://www.flightgear.org). gnu-gpl2
FlightForge (🥉8 · ⭐ 14) - FlightForge: An open source Unreal engine based quadcopter simulator. BSD-3
RotorTM (🥉6 · ⭐ 78 · 💤) - GPL-3.0
swarm_sync_sim (🥉6 · ⭐ 16) - swarm_sync_sim (also known as sss) is an ultra-lightweight, ROS-based simulator for robotic swarms, including.. BSD-3
optimAero PX4 (🥉6 · ⭐ 15) - PX4 Simulink Software-In-Loop Simulation. GPL-3.0
Ardupilot_Multiagent_Simulation (🥉4 · ⭐ 72 · 🐣) - Simulation environment for multiagent drone systems using Ardupilot, ROS 2, and Gazebo enabling users to spawn and.. GPL-3.0
Itomori (🥉4 · ⭐ 11 · 💤) - Gymnasium environment for research of UAVs and risk constraints. MIT
Matlab UAV Toolbox (🥉1) - MathWorks Software License Agreement
Realflight (🥉1) - proprietary software license
X-plane (🥉1) - proprietary license
Spleenlab simulator (🥉1) - proprietary
Show 1 hidden projects...

Maritime Robotics Simulators
Back to top

Simulator frameworks made especially for maritime robotics

Virtual RobotX (🥇19 · ⭐ 580) - Virtual RobotX (VRX) resources. Apache-2
DAVE (🥈15 · ⭐ 270 · 💤) - Project DAVE. Apache-2
SMaRC 2 (🥈15 · ⭐ 16) - smarc ros2-humble main repository. BSD-3-Clause and MIT
UNav-Sim (🥈14 · ⭐ 260) - Visually Realistic Underwater Robotics Simulator UNav-Sim. MIT
Stonefish (🥈13 · ⭐ 200) - Stonefish - an advanced C++ simulation library designed for (but not limited to) marine robotics. GPL-3.0
Ocean Sim (🥈12 · ⭐ 340) - [IROS 2025] OceanSim: A GPU-Accelerated Underwater Robot Perception Simulation Framework. BSD-3
Moos-ivp (🥈12 · ⭐ 33) - MOOS-IvP is a set of modules for providing autonomy on robotic platforms, in particular autonomous marine vehicles. GPLv3 LGPLv3 and Commercial
HoloOcean (🥉10 · ⭐ 70) - A UE5 based simulator for marine perception and autonomy, with multi-agent communications and many common underwater.. MIT and Unreal Engine EULA
GitHub (👨‍💻 11 · 🔀 31 · 📋 170 - 13% open · ⏱️ 29.09.2025):

 git clone https://github.com/byu-holoocean/HoloOcean
MARUSimulator (🥉7 · ⭐ 21) - Marine simulator core assets for Unity. Apache-2
Show 10 hidden projects...

Automotive Simulators
Back to top

Simulator frameworks made especially for automotive

Carla (🥇33 · ⭐ 13K) - Open-source simulator for autonomous driving research. MIT
ESMINI (🥈25 · ⭐ 880) - a basic OpenSCENARIO player. MPL-2.0
AWSim (🥈25 · ⭐ 640) - Open sourced digital twin simulator for Autoware. Apache-2
Show 2 hidden projects...

Space Robotics Simulators
Back to top

Simulator frameworks made especially for space robotics

Basilisk (🥇23 · ⭐ 250) - Astrodynamics simulation framework. ISC
Astrobee (🥈19 · ⭐ 1.2K) - NASA Astrobee Robot Software. Apache-2
BSK-RL (🥈16 · ⭐ 83) - RL environments and tools for spacecraft autonomy research, built on Basilisk. Developed by the AVS Lab. MIT
OmiLRS (🥉11 · ⭐ 140) - Omniverse Lunar Robotics Simulator. BSD-3
Mars Explorer (🥉6 · ⭐ 72 · 💤) - no license
LunarSim (🥉5 · ⭐ 53 · 💤) - LunarSim: Lunar Rover Simulator Focused on High Visual Fidelity and ROS 2 Integration for Advanced Computer Vision.. Missing

AI training Simulators
Back to top

Simulations made for training for AI-agents like reinforcement learning

Gymnasium (🥇40 · ⭐ 11K) - An API standard for single-agent reinforcement learning environments, with popular reference environments and related.. MIT
Genesis (🥇30 · ⭐ 28K) - A generative world for general-purpose robotics & embodied AI learning. Apache-2
NVIDIA Isaac Sim Isaac Lab (🥇27 · ⭐ 5.4K) - Unified framework for robot learning built on NVIDIA Isaac Sim. BSD-3
Metaworld (🥈25 · ⭐ 1.6K · 📈) - Collections of robotics environments geared towards benchmarking multi-task and meta reinforcement learning. MIT
AI2-thor (🥈25 · ⭐ 1.6K) - An open-source platform for Visual AI. Apache-2
Gymnasium Robotics (🥈25 · ⭐ 800) - A collection of robotics simulation environments for reinforcement learning. MIT
jaxsim (🥈22 · ⭐ 160) - A differentiable physics engine and multibody dynamics library for control and robot learning. BSD-3
IGibson (🥈21 · ⭐ 780 · 💤) - A Simulation Environment to train Robots in Large Realistic Interactive Scenes. MIT
Habitat Sim (🥈20 · ⭐ 3.3K) - A flexible, high-performance 3D simulator for Embodied AI research. MIT
Jiminy (🥈20 · ⭐ 270) - Jiminy: a fast and portable Python/C++ simulator of poly-articulated robots with OpenAI Gym interface for.. MIT
ManiSkill (🥈19 · ⭐ 2.2K) - SAPIEN Manipulation Skill Framework, an open source GPU parallelized robotics simulator and benchmark, led by Hillbot,.. Apache-2
Sapien (🥈19 · ⭐ 670) - SAPIEN Embodied AI Platform. Unlicensed
MuJoCo playground (🥈18 · ⭐ 1.6K) - An open-source library for GPU-accelerated robot learning and sim-to-real transfer. Apache-2
RoboVerse (🥈18 · ⭐ 1.5K) - RoboVerse: Towards a Unified Platform, Dataset and Benchmark for Scalable and Generalizable Robot Learning. Apache-2
MetaDrive (🥈18 · ⭐ 1K) - MetaDrive: Lightweight driving simulator for everyone. Apache-2
K-Sim (🥈18 · ⭐ 210 · 📉) - RL training library for humanoid locomotion and manipulation. Built on top of MuJoCo and JAX. MIT
mjlab (🥉17 · ⭐ 970 · 🐣) - Isaac Lab API, powered by MuJoCo-Warp, for RL and robotics research. Apache-2
Holodeck (🥉17 · ⭐ 590 · 💤) - High Fidelity Simulator for Reinforcement Learning and Robotics Research. MIT
LocoMuJoCo (🥉16 · ⭐ 1.3K) - Imitation learning benchmark focusing on complex locomotion tasks using MuJoCo. MIT
Gibson (🥉15 · ⭐ 920 · 💤) - Gibson Environments: Real-World Perception for Embodied Agents. MIT
Safe Control Gym (🥉15 · ⭐ 790) - PyBullet CartPole and Quadrotor environmentswith CasADi symbolic a priori dynamicsfor learning-based control and RL. MIT
PyRep (🥉15 · ⭐ 750 · 💤) - A toolkit for robot learning research. MIT
robo-gym (🥉14 · ⭐ 460) - An open source toolkit for Distributed Deep Reinforcement Learning on real and simulated robots. MIT
ProcTHOR (🥉14 · ⭐ 400 · 💤) - Scaling Embodied AI by Procedurally Generating Interactive 3D Houses. Apache-2
RoboCasa (🥉12 · ⭐ 990) - RoboCasa: Large-Scale Simulation of Everyday Tasks for Generalist Robots. MIT
Deepdrive (🥉12 · ⭐ 920 · 💤) - Deepdrive is a simulator that allows anyone with a PC to push the state-of-the-art in self-driving. Unlicensed
racecar_gym (🥉12 · ⭐ 210 · 💤) - A gym environment for a miniature racecar using the pybullet physics engine. MIT
OmniIsaacGymEnvs (🥉11 · ⭐ 1K · 💤) - Reinforcement Learning Environments for Omniverse Isaac Gym. Unlicensed
PyBullet Gym (🥉11 · ⭐ 870 · 💤) - Open-source implementations of OpenAI Gym MuJoCo environments for use with the OpenAI Gym Reinforcement Learning.. MIT
UAIbot (🥉10 · ⭐ 6) - The Python version of the UAIbot simulator. MIT
Arnold (🥉9 · ⭐ 180 · 💤) - [ICCV 2023] Official code repository for ARNOLD benchmark. MIT
IsaacLab-HARL (🥉8 · ⭐ 6 · 🐣) - Unified framework for robot learning built on NVIDIA Isaac Sim. BSD-3
Reinforcement Learning Toolbox (🥉1) - Proprietary Software License
Show 1 hidden projects...

Other Domain Specific Simulators
Back to top

Robotic simulators build for other domains like automotive or space robotics

Panda-Gym (🥇14 · ⭐ 710 · 💤) - Set of robotic environments based on PyBullet physics engine and gymnasium. MIT
AutoDRIVE Simulator (🥈13 · ⭐ 120) - An Integrated Cyber-Physical Ecosystem for Autonomous Driving Research and Education. BSD-2
DexterousHands (🥈12 · ⭐ 900) - This is a library that provides dual dexterous hand manipulation tasks through Isaac Gym. Apache-2
Graspit! (🥈11 · ⭐ 210 · 💤) - The GraspIt! simulator. Unlicensed
gym-softrobot (🥈11 · ⭐ 37) - Softrobotics environment package for OpenAI Gym. MIT
Strech MuJoCo (🥉10 · ⭐ 51) - This library provides a simulation stack for Stretch, built on MuJoCo. BSD-3-Clause-Clear
Stewart Platform Simulator (🥉6 · ⭐ 41) - The RAW inverse kinematics library for Stewart Platforms written in JavaScript. MIT
multi-agent_sim (🥉6 · ⭐ 41) - Fully open architecture implementation of modern multi-agent coordination techniques. MIT
Roadrunner (🥉1) - Proprietary Software License

Game engines
Back to top

3D engines made for games but can be interfaced with robotic frameworks

Godot (🥇45 · ⭐ 100K) - Godot Engine Multi-platform 2D and 3D game engine. MIT
Bevy (🥈39 · ⭐ 43K) - A refreshingly simple data-driven game engine built in Rust. Apache-2
O3DE (🥈29 · ⭐ 8.7K) - Open 3D Engine (O3DE) is an Apache 2.0-licensed multi-platform 3D engine that enables developers and content creators.. MIT and Apache-2
Unity (🥉1) - Unity Subscription Plans
Unreal Engine (🥉1) - EULA
Roblox (🥉1) - proprietary

Physics Engines
Back to top

Physics Engines that simulate multi-joint dynamics, gravity etc

Drake (🥇32 · ⭐ 3.8K) - Model-based design and verification for robotics. BSD-3
Pinocchio (🥇30 · ⭐ 2.8K) - A fast and flexible implementation of Rigid Body Dynamics algorithms and their analytical derivatives. BSD-2
Project CHRONO (🥇28 · ⭐ 2.6K) - High-performance C++ library for multiphysics and multibody dynamics simulations. BSD-3
Bullet Physics SDK (🥈27 · ⭐ 14K) - Bullet Physics SDK: real-time collision detection and multi-physics simulation for VR, games, visual effects,.. zlib
Avian 3D (🥈27 · ⭐ 2.6K) - ECS-driven 2D and 3D physics engine for the Bevy game engine. Apache-2
BRAX (🥈26 · ⭐ 2.9K) - Massively parallel rigidbody physics simulation on accelerator hardware. Apache-2
JSBSim (🥈24 · ⭐ 1.8K) - An open source flight dynamics & control software library. LGPL-2.1
DART (🥈24 · ⭐ 1K · 📈) - DART: Dynamic Animation and Robotics Toolkit. BSD-2
Simbody (🥈20 · ⭐ 2.5K) - High-performance C++ multibody dynamics/physics library for simulating articulated biomechanical and mechanical.. Apache-2
MuJoCo Wrap (🥈20 · ⭐ 880) - GPU-optimized version of the MuJoCo physics simulator, designed for NVIDIA hardware. Apache-2
PhysX 5 (🥉17 · ⭐ 4.2K) - NVIDIA PhysX SDK. BSD-3
TPE (part of gz-physics) (🥉17 · ⭐ 74) - Abstract physics interface designed to support simulation and rapid development of robot applications. Apache-2
RaiSim (🥉16 · ⭐ 400) - Visit www.raisim.com. Proprietary Software License
PhysX SDK (legacy) (🥉15 · ⭐ 3.4K · 💤) - NVIDIA PhysX SDK. NVIDIA Omniverse License Agreement
ODE (🥉11 · ⭐ 180 · 💤) - Open Dynamics Engine (ODE) github mirror from https://bitbucket.org/odedevs/ode. gnu-gpl and BSD-3-clause
FleX (🥉9 · ⭐ 750 · 💤) - Nvidia Software License
PyFleX (🥉7 · ⭐ 140 · 💤) - Customized Python APIs for NVIDIA FleX. Nvidia Software License
AGX Dynamics by Algoryx (🥉2) - AGX Dynamics, by Algoryx, is a modular physics simulation toolkit available in C++, C# and Python, on Windows, Mac and.. Proprietary Software License
Vortex (🥉1) - EULA
Newton Dynamics (🥉1) - zlib
Havok Physics (🥉1) - Per-title licensing model
Simscape (🥉1) - Proprietary Software License

Rendering engines
Back to top

Rendering engines for robotic simulators

Atom (🥇29 · ⭐ 8.7K) - Open 3D Engine (O3DE) is an Apache 2.0-licensed multi-platform 3D engine that enables developers and content creators.. Apache-2.0 and MIT
Wren (Webots) (🥈28 · ⭐ 3.9K · 📈) - Webots Robot Simulator. Apache-2
OGRE (🥈27 · ⭐ 4.4K) - scene-oriented, flexible 3D engine (C++, Python, C#, Java). MIT
PyRender (🥉25 · ⭐ 1.4K · 💤) - Easy-to-use glTF 2.0-compliant OpenGL renderer for visualization of 3D scenes. MIT
Vulkan (🥉24 · ⭐ 3.5K) - Open-Source Vulkan C++ API. Apache-2
OpenGL (🥉24 · ⭐ 3.5K) - Open-Source Vulkan C++ API. Apache-2
Unity Rendering Plugin (🥉13 · ⭐ 920) - C++ Rendering Plugin example for Unity. MIT

Others
Back to top

HighwayEnv (🥇25 · ⭐ 3.1K · 📈) - A minimalist environment for decision-making in autonomous driving. MIT
Resources
Here are the resources used to complete these list, if not directly contributed by others.

Lists:
Aerial Robotics Landscape - Simulation: A linking website to all kinds of aerial robotic tooling
Awesome Weekly Robotics list: All kinds of useful links as featured in Weekly Robotics
ROS discourse: shared simulators with the ROS community
Awesome Robotics by Kiloreux A list of awesome robotics resources
Awesome Robotics by ahundt
Awesome ros2 by fkromer
Awesome robotic tooling
Awesome robotics projects by mjyc
Awesome LLM Robotics by GT-RIPL:
Best-of lists: Discover other best-of lists with awesome open-source projects on all kinds of topics.
Robot-manipulation.org simulator list
Repositories
Copper RS
Hello Robot
Blogs
Navigating through the Robotic Simulation Landscape: The blogpost by Kimberly McGuire that started this list
Ekumen at FOSDEM 2025: Accelerating robotics development through simulation: The blogpost by Ekumen about robotic simulation.
Talks:
FOSDem 2025 Robotics and Simulation: Talk about an overview of robotic simulators
Papers:
C. A. Dimmig et al., "Survey of Simulators for Aerial Robots: An Overview and In-Depth Systematic Comparisons," in IEEE Robotics & Automation Magazine, doi: 10.1109/MRA.2024.3433171 ArXiv
Player, Timothy R., et al. "From concept to field tests: Accelerated development of multi-AUV missions using a high-fidelity faster-than-real-time simulator." 2023 IEEE International Conference on Robotics and Automation (ICRA). IEEE, 2023. ArXiv
Contribution
Contributors
Those that contributed to this list, proposed updates or have suggested new projects:

Kimberly McGuire (@knmcguire)
Mat Sadowski (@msadowski)
Sebastian Castro (@sea-bass)
Marek Kraft (@PUTvision)
Fatemeh Pourhashem (?)
Ramon Roche (@mrpollo)
Robert Eisele (@infusion)
Silvio Traversaro (@traversaro)
Hugo Börjesson (@hugoberjesson)
Neeraj Cherakara (@iamnambiar)
@jmackay2
Christoph Kammer (@ckammer87)
Gokul Puthumanaillam (@gokulp01)
Spicer Bak (@SBFRF)
Mabel Zhang (@mabelzhang)
Pedro Roque (@pPedro-Roque)
Özer Özkahraman (@KKalem)
Pierre Kancier (@khancyr)
Tanmay/Chinmay Samak (@Tinker-Twins)
Peixuan Shu (@Peixuan Shu)
Jennifer Buehler (@JenniferBuehler)
@MiaoDX
Louis Le Lay (@louislelay)
How to Contribute
Contributions are encouraged and always welcome! If you like to add or update projects, choose one of the following ways:

Open an issue by selecting one of the provided categories from the issue page and fill in the requested information.
Modify the projects.yaml with your additions or changes, and submit a pull request. This can also be done directly via the Github UI.
If you like to contribute to or share suggestions regarding the project metadata collection or markdown generation, please refer to the best-of-generator repository. If you like to create your own best-of list, we recommend to follow this guide.

For more information on how to add or update projects, please read the contribution guidelines. By participating in this project, you agree to abide by its Code of Conduct.

Other projects for Simulation Comparison
Simulately - Has some great tools for fluid and soft body physics simulators!
License
CC0

About
A Best-of-list of Robot Simulators, re-generated weekly on Wednesdays

Resources
 Readme
License
 CC-BY-SA-4.0 license
Code of conduct
 Code of conduct
Contributing
 Contributing
 Activity
Stars
 992 stars
Watchers
 14 watching
Forks
 65 forks
Report repository
Releases 32
Update: 2025.11.12
Latest
2 days ago
+ 31 releases
Contributors
9
@knmcguire
@github-actions[bot]
@BlakePR
@iamnambiar
@gokulp01
@louislelay
@tmmsartor
@traversaro
@sea-bass
Footer
© 2025 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information

## https://github.com/jslee02/awesome-robotics-libraries
Skip to content
Navigation Menu
Platform
Solutions
Resources
Open Source
Enterprise
Pricing

Search or jump to...
Sign in
Sign up
jslee02
/
awesome-robotics-libraries
Public
Code
Issues
2
Pull requests
Actions
Security
Insights
jslee02/awesome-robotics-libraries
Go to file
Name		
sammyatman
sammyatman
Added LeRobot Episode Scoring Toolkit (#54)
90d2778
 · 
last month
.github
Create dependabot.yml
2 years ago
COMPARISONS.md
Update COMPARISONS.md
7 years ago
CONTRIBUTING.md
Update CONTRIBUTING.md
9 years ago
LICENSE
Initial commit
9 years ago
README.md
Added LeRobot Episode Scoring Toolkit (#54)
last month
Repository files navigation
README
Contributing
CC0-1.0 license
Awesome Robotics Libraries
A curated list of robotics simulators and libraries.

Table of Contents
Simulators
Libraries
Dynamics Simulation
Inverse Kinematics
Machine Learning
Motion Planning and Control
Optimization
Robot Modeling
Robot Platform
SLAM
Vision
Fluid
Multiphysics
Math
ETC
Other Awesome Lists
Contributing
Simulators
Free or Open Source
AI2-THOR - Python framework with a Unity backend, providing interaction, navigation, and manipulation support for household based robotic agents [github AI2-THOR]
AirSim - Simulator based on Unreal Engine for autonomous vehicles [github AirSim]
ARGoS - Physics-based simulator designed to simulate large-scale robot swarms [github ilpincy/argos3]
ARTE - Matlab toolbox focussed on robotic manipulators [github 4rtur1t0/ARTE]
AVIS Engine - Autonomous Vehicles Intelligent simulation software, A Fast and robust simulator software for Autonomous vehicle development. [github AvisEngine/AVIS-Engine-Python-API]
CARLA - Open-source simulator for autonomous driving research [github carla-simulator/carla]
CoppeliaSim - Formaly V-REP. Virtual robot experimentation platform [github CoppeliaRobotics/CoppeliaSimLib]
Gazebo - Dynamic multi-robot simulator [github osrf/gazebo]
GraspIt! - Simulator for grasping research that can accommodate arbitrary hand and robot designs [github graspit]
Habitat-Sim - Simulation platform for research in embodied artificial intelligence [github facebookresearch/habitat-sim]
Hexapod Robot Simulator - Open-source hexapod robot inverse kinematics and gaits visualizer [github mithi/hexapod]
Ignition Gazebo - Open source robotics simulator [github ignitionrobotics/ign-gazebo]
Isaac Sim - Nvidia's robotic simulation environment with GPU physics simulation and ray tracing
ManiSkill - A robot simulation and behavior learning package powered by SAPIEN, with a strong focus on manipulation skills.
MORSE - Modular open robots simulation engine [github morse]
Neurorobotics Platform - Internet-accessible simulation of robots controlled by spiking neural networks [bitbucket]
PyBullet - An easy to use simulator for robotics and deep reinforcement learning [github bullet3]
PyBullet_Industrial - A extension to PyBullet that allows for the simulation of various robotic manufacturing processes such as milling or 3D-printing. [github pybullet_industrial]
Robot Gui - A three.js based 3D robot interface [github glumb/robot-gui]
SAPIEN - A realistic and physics-rich simulated environment that hosts a large-scale set for articulated objects. [github haosulab/SAPIEN]
Simbad - A Java 3D robot simulator, enables to write own robot controller with modifying environment using available sensors.
Unity - Popular game engine that now offers open-source tools, tutorials, and resources for robotics simulation [github Unity-Technologies/Unity-Robotics-Hub]
Webots - A complete development environment to model, program and simulate robots, vehicles and mechanical systems [github cyberbotics/webots]
Commercial
Actin Simulation
Artiminds - Planning, programming, operation, analysis and optimization
Kineo - Path planning and trajectory optimization for industrial robotics and digital mock-up review applications
RobotDK - Simulation and OLP for robots
RobotStudio
Robot Virtual Worlds
Virtual Robotics Toolkit
Visual Components
Cloud
AWS RoboMaker - Service that makes it easy to develop, test, and deploy intelligent robotics applications at scale
Libraries
Dynamics Simulation
⚠️ The following table is not complete. Please feel free to report if you find something incorrect or missing.

Name	Models	Features	Languages	Licenses	Code	Popularity
ARCSim	soft		C++			
Bullet	rigid, soft	ik, id, urdf, sdf	C++, Python	Zlib	github	bullet3
CHRONO::ENGINE	rigid, soft, granular, fluid	ik, urdf	C++, Python	BSD-3-Clause	github	chrono
DART	rigid, soft	ik, id, plan, urdf, sdf	C++, Python	BSD-2-Clause	github	dart
Drake	rigid, aero, fluid	ik, trj-opt, plan	C++, Matlab	BSD-3-Clause	github	drake
Flex	rigid, soft, particle, fluid		C++		github	NVIDIAGameWorks/FleX
FROST	rigid		MATLAB	BSD-3-Clause	github	ayonga/frost-dev
IBDS	rigid, particle		C++	Zlib		
idyntree	rigid	id	C++, Python, Matlab, Lua	LGPL-2.1	github	idyntree
KDL	rigid	ik	C++	LGPL-2.1	github	orocos_kinematics_dynamics
kindr	rigid	(todo)	C++, Matlab	BSD-3-Clause	github	kindr
Klampt	(todo)	(todo)	C++, Python	BSD-3-Clause	github	Klampt
LibrePilot	uav, vehicles	(todo)	C++	GPL-3.0	bitbucket, github	LibrePilot
MARS	(todo)	(todo)	C++, Python	LGPL-3.0	github	mars
MBDyn	(todo)	(todo)	C++	GPL-2.1	download	
MBSim	(todo)	(todo)	C++	(not specified)	github	mbsim-env/mbsim
MBSlib	(todo)	(todo)	C++	LGPL-3.0	github	mbslib
metapod	(todo)	(todo)	C++	LGPL-3.0	github	metapod
Moby	rigid	id	C++	GPL-2.0	github	Moby
mrpt	vehicle	slam, cv	C++, Python, Matlab	BSD-3-Clause	github	mrpt
MuJoCo	(todo)	id	C++, Python	licenses	closed source	
mvsim	vehicle	(todo)	C++	GPL-3.0	github	ual-arm-ros-pkg/mvsim
Newton Dynamics	(todo)	(todo)	C++	Zlib	github	newton-dynamics
nphysics	(todo)	(todo)	Rust	BSD-3-Clause	github	sebcrozet/nphysics
ODE	rigid		C++	LGPL-2.1 or BSD-3-Clause	bitbucket	
OpenRAVE	(todo)	(todo)	C++, Python	LGPL-3.0	github	openrave
pinocchio	rigid	ik, id, urdf, analytical derivatives, code generation	C++, Python	BSD-2-Clause	github	pinocchio
PositionBasedDynamics	(todo)	(todo)	C++	MIT	github	PositionBasedDynamics
PhysX	(todo)	(todo)	C++	unknown	github	NVIDIAGameWorks/PhysX
PyDy	(todo)	(todo)	Python	BSD-3-Clause	github	pydy
RBDL	rigid	ik,id,urdf	C++, Python	Zlib	github	rbdl
RBDyn	rigid	(todo)	C++, Python	LGPL-3.0	github	RBDyn
RaiSim	(todo)	(todo)	C++	custom	github	leggedrobotics/raisimLib
ReactPhysics3d	(todo)	(todo)	C++	Zlib	github	reactphysics3d
RigidBodyDynamics.jl	rigid	(todo)	Julia	MIT "Expat"	github	RigidBodyDynamics.jl
Rigs of Rods	rigid, soft, vehicle	(todo)	C++	GPL-3.0	github	RigsOfRods/rigs-of-rods
Robopy	(todo)	(todo)	Python 3	MIT	github	adityadua24/robopy
Robotics Library	(todo)	(todo)	C++	GPL-3.0 or BSD-2-Clause	github	rl
RobWork	(todo)	(todo)	C++	Apache-2.0	gitlab	
siconos	(todo)	(todo)	C++, Python	Apache-2.0	github	siconos
Simbody	rigid, molecules	id, urdf	C++	Apache-2.0	github	simbody
SOFA	rigid, soft, medical	(todo)	C++	LGPL-2.1	github	sofa
Tiny Differentiable Simulator	rigid	(todo)	C++, Python	Apache-2.0	github	google-research/tiny-differentiable-simulator
trep	rigid	dm, trj-opt	C, Python	GPL-3.0	github	trep
qu3e	rigid	-	C++	Zlib	github	qu3e
For simplicity, shortened names are used to represent the supported models and features as

Supported Models

rigid: rigid bodies
soft: soft bodies
aero: aerodynamics
granular: granular materials (like sand)
fluid: fluid dynamics
vehicles
uav: unmanned aerial vehicles (like drones)
medical
molecules
parallel: parallel mechanism (like Stewart platform)
Features on Simulation, Analysis, Planning, Control Design

dm: discrete mechanics
ik: inverse kinematics solvers (please find IK specialized packages in this list)
id: inverse dynamics
slam: simultaneous localization and mapping
trj-opt: trajectory optimization
plan: motion planning algorithms
cv: computer vision
urdf: urdf parser
sdf: sdf parser
Inverse Kinematics
IKBT - A python package to solve robot arm inverse kinematics in symbolic form [github uw-biorobotics/IKBT]
Kinpy - A simple pure python package to solve inverse kinematics [github neka-nat/kinpy]
Lively - A highly configurable toolkit for commanding robots in mixed modalities [github Wisc-HCI/lively]
RelaxedIK - Real-time Synthesis of Accurate and Feasible Robot Arm Motion [github uwgraphics/relaxed_ik]
Trip - A python package that solves inverse kinematics of parallel-, serial- or hybrid-robots [github TriPed-Robot/TriP]
Machine Learning
AllenAct - Python/PyTorch-based Research Framework for Embodied AI [github wichtounet/dll]
Any4LeRobot - A collection of utilities and tools for LeRobot [github wichtounet/dll]
DLL - Deep Learning Library (DLL) for C++ [github wichtounet/dll]
DyNet - The Dynamic Neural Network Toolkit [github clab/dynet]
Fido - Lightweight C++ machine learning library for embedded electronics and robotics [github FidoProject/Fido]
Ivy - Unified Machine Learning Framework [github unifyai/ivy]
LeRobot - State-of-the-art approaches, pretrained models, datasets, and simulation environments for real-world robotics in PyTorch. [github huggingface/lerobot]
LeRobot Episode Scoring Toolkit - One-click tool to score, filter, and export higher-quality LeRobot datasets. [github RoboticsData/score_lerobot_episodes]
MiniDNN - A header-only C++ library for deep neural networks [github yixuan/MiniDNN]
mlpack - Scalable C++ machine learning library [github mlpack/mlpack]
OpenAI Gym - Developing and comparing reinforcement learning algorithms [github gym]
gym-dart [github dart-env]
gym-gazebo [github dart-env]
RLLib - Temporal-difference learning algorithms in reinforcement learning [github samindaa/RLLib]
robosuite - A modular simulation framework and benchmark for robot learning [github ARISE-Initiative/robosuite]
tiny-dnn - Header only, dependency-free deep learning framework in C++14 [github tiny-dnn/tiny-dnn]
Motion Planning and Control
AIKIDO - Solving robotic motion planning and decision making problems. [github aikido]
Bioptim - Bioptim, a Python Framework for Musculoskeletal Optimal Control in Biomechanics [github pyomeca/bioptim]
CuiKSuite - Applications to solve position analysis and path planning problems
cuRobo - A CUDA accelerated library containing a suite of robotics algorithms that run significantly faster. [github nvlabs/curobo]
Control Toolbox - Open-Source C++ Library for Robotics, Optimal and Model Predictive Control [github ethz-adrl/control-toolbox]
Crocoddyl - Optimal control library for robot control under contact sequence [github loco-3d/crocoddyl]
Fields2Cover - Robust and efficient coverage paths for autonomous agricultural vehicles [github Fields2Cover/Fields2Cover]
GPMP2 - Gaussian Process Motion Planner 2 [github gtrll/gpmp2]
HPP - Path planning for kinematic chains in environments cluttered with obstacles [github]
MoveIt! - Motion planning framework [github moveit]
OMPL - Open motion planning library [bitbucket, github ompl]
OCS2 - Efficient continuous and discrete time optimal control implementation [bitbucket]
pymanoid - Humanoid robotics prototyping environment based on OpenRAVE [github stephane-caron/pymanoid]
ROS Behavior Tree - [github miccol/ROS-Behavior-Tree]
Ruckig - Real-time, time-optimal and jerk-constrained online trajectory generation. [github ruckig]
The Kautham Project - A robot simulation toolkit for motion planning [github kautham]
TOPP-RA - Time-parameterizing robot trajectories subject to kinematic and dynamic constraints [github hungpham2511/toppra]
Ungar - Expressive and efficient implementation of optimal control problems using template metaprogramming [github fdevinc/ungar]
Motion Optimizer
TopiCo - Time-optimal Trajectory Generation and Control [github AIS-Bonn/TopiCo]
towr - A light-weight, Eigen-based C++ library for trajectory optimization for legged robots [github ethz-adrl/towr]
TrajectoryOptimization - A fast trajectory optimization library written in Julia [github RoboticExplorationLab/TrajectoryOptimization.jl]
trajopt - Framework for generating robot trajectories by local optimization [github joschu/trajopt]
Nearest Neighbor
Cover-Tree - Cover tree data structure for quick k-nearest-neighbor search [github Cover-Tree]
Faster cover trees by Mike Izbicki et al., ICML 2015.
FLANN - Fast Library for Approximate Nearest Neighbors [github flann]
nanoflann - Nearest Neighbor search with KD-trees [github nanoflann]
3D Mapping
libpointmatcher - Iterative Closest Point library for 2-D/3-D mapping in Robotics [github ethz-asl/libpointmatcher]
Octree - Fast radius neighbor search with an Octree [github jbehley/octree]
OctoMap - Efficient Probabilistic 3D Mapping Framework Based on Octrees [github octomap]
PCL - 2D/3D image and point cloud processing [github PointCloudLibrary/pcl]
Treexy - Brutally fast, sparse, 3D Voxel Grid [github Treexy]
voxblox - Flexible voxel-based mapping focusing on truncated and Euclidean signed distance fields [github voxblox]
wavemap - Fast, efficient and accurate multi-resolution, multi-sensor 3D occupancy mapping [github wavemap]
Utility Software
Goxel - Free and open source 3D voxel editor [github guillaumechereau/goxel]
Optimization
CasADi - Symbolic framework for algorithmic differentiation and numeric optimization [github casadi]
Ceres Solver - Large scale nonlinear optimization library [github ceres-solver]
eigen-qld - Interface to use the QLD QP solver with the Eigen3 library [github jrl-umi3218/eigen-qld]
EXOTica - Generic optimisation toolset for robotics platforms [github ipab-slmc/exotica]
hpipm - High-performance interior-point-method QP solvers (Ipopt, Snopt) [github giaf/hpipm]
HYPRE - Parallel solvers for sparse linear systems featuring multigrid methods [github hypre-space/hypre]
ifopt - An Eigen-based, light-weight C++ Interface to Nonlinear Programming Solvers (Ipopt, Snopt) [github ifopt]
Ipopt - Large scale nonlinear optimization library [github Ipopt]
libcmaes - Blackbox stochastic optimization using the CMA-ES algorithm [github beniz/libcmaes]
limbo - Gaussian processes and Bayesian optimization of black-box functions [github resibots/limbo]
lpsolvers - Linear Programming solvers in Python with a unified API [github lpsolvers]
NLopt - Nonlinear optimization [github nlopt]
OptimLib - Lightweight C++ library of numerical optimization methods for nonlinear functions [github kthohr/optim]
OSQP - The Operator Splitting QP Solver [github osqp/osqp]
Pagmo - Scientific library for massively parallel optimization [github esa/pagmo2]
ProxSuite - The Advanced Proximal Optimization Toolbox [github Simple-Robotics/ProxSuite]
pymoo - Multi-objective Optimization in Python [github msu-coinlab/pymoo]
qpsolvers - Quadratic Programming solvers in Python with a unified API [github qpsolvers]
RobOptim - Numerical Optimization for Robotics. [github roboptim/roboptim-core]
SCS - Numerical optimization for solving large-scale convex cone problems [github scs]
SHOT - A solver for mixed-integer nonlinear optimization problems [github coin-or/SHOT]
sferes2 - Evolutionary computation [github sferes2/sferes2]
Robot Modeling
Robot Model Description Format
SDF - XML format that describes objects and environments for robot simulators, visualization, and control (bitbucket)
urdf - XML format for representing a robot model [github ros/urdfdom]
Utility to Build Robot Models
onshape-to-robot - Converting OnShape assembly to robot definition (SDF or URDF) through OnShape API [github phobos]
phobos - Add-on for Blender creating URDF and SMURF robot models [github phobos]
Robot Platform
AutoRally - High-performance testbed for advanced perception and control research [github autorally/autorally]
Linorobot - ROS compatible ground robots [github linorobot/linorobot]
onine - Service Robot based on Linorobot and Braccio Arm [github grassjelly/onine]
Micro-ROS for Arduino - a Micro-ROS fork available in the Arduino Library Manager
Rock - Software framework for robotic systems
ROS - Flexible framework for writing robot software [github repos]
ROS 2 - Version 2.0 of the Robot Operating System (ROS) software stack [github repos]
YARP - Communication and device interfaces applicable from humanoids to embedded devices [github robotology/yarp]
SLAM
AprilSAM - Real-time smoothing and mapping [github xipengwang/AprilSAM]
Cartographer - Real-time SLAM in 2D and 3D across multiple platforms and sensor configurations [github cartographer]
DSO - Novel direct and sparse formulation for Visual Odometry [github dso]
ElasticFusion - Real-time dense visual SLAM system [github ElasticFusion]
fiducials - Simultaneous localization and mapping using fiducial markers [github UbiquityRobotics/fiducials]
GTSAM - Smoothing and mapping (SAM) in robotics and vision [github borglab/gtsam]
Kintinuous - Real-time large scale dense visual SLAM system [github Kintinuous]
LSD-SLAM - Real-time monocular SLAM [github lsdslam]
ORB-SLAM2 - Real-time SLAM library for Monocular, Stereo and RGB-D cameras [github ORB_SLAM2]
RTAP-Map - RGB-D Graph SLAM approach based on a global Bayesian loop closure detector [github introlab/rtabmap]
SRBA - Solving SLAM/BA in relative coordinates with flexibility for different submapping strategies [github srba]
SLAM Dataset
Awesome SLAM Datasets
Vision
ViSP - Visual Servoing Platform [github lagadic/visp]
BundleTrack - 6D Pose Tracking for Novel Objects without 3D Models [github wenbowen123/BundleTrack]
se(3)-TrackNet - 6D Pose Tracking for Novel Objects without 3D Models [github wenbowen123/iros20-6d-pose-tracking]
Fluid
Fluid Engine Dev - Jet - Fluid simulation engine for computer graphics applications [github doyubkim/fluid-engine-dev]
Multiphysics
Kratos - Framework for building parallel multi-disciplinary simulation software [github KratosMultiphysics/Kratos]
Math
Fastor - Light-weight high performance tensor algebra framework in C++11/14/17 [github romeric/Fastor]
linalg.h - Single header public domain linear algebra library for C++11 [github sgorsten/linalg]
manif - Small c++11 header-only library for Lie theory. [github artivis/manif]
Sophus - Lie groups using Eigen [github strasdat/Sophus]
SpaceVelAlg - Spatial vector algebra with the Eigen3 [github jrl-umi3218/SpaceVecAlg]
spatialmath-python - A python package provides classes to represent pose and orientation in 3D and 2D space, along with a toolbox of spatial operations. [github bdaiinstitute/spatialmath-python]
ETC
fuse - General architecture for performing sensor fusion live on a robot [github locusrobotics/fuse]
Foxglove Studio – A fully integrated visualization and debugging desktop app for your robotics data. Combines functionality of tools like rviz, rqt, and more. Also available via web app.
Other Awesome Lists
Awesome Robotics (Kiloreux)
Awesome Robotics (ahundt)
Awesome Robotic Tooling
Awesome Artificial Intelligence
Awesome Collision Detection
Awesome Computer Vision
Awesome Machine Learning
Awesome Deep Learning
Awesome Gazebo
Awesome Grasping
Awesome Human Robot Interaction
PythonRobotics - Python sample codes for robotics algorithms
Robotics Coursework - A list of robotics courses you can take online
Contributing
Contributions are very welcome! Please read the contribution guidelines first. Also, please feel free to report any error.

License
CC0

About
😎 A curated list of robotics libraries and software

jslee02.github.io/awesome-robotics-libraries/
Topics
machine-learning robotics simulation optimization motion-planning awesome-list slam robotics-libraries multibody-dynamics
Resources
 Readme
License
 CC0-1.0 license
Contributing
 Contributing
 Activity
Stars
 2.7k stars
Watchers
 123 watching
Forks
 466 forks
Report repository
Releases
No releases published
Packages
No packages published
Contributors
37
@jslee02
@martinfelis
@jcarpent
@ferrolho
@awinkler
@liquidcronos
@erwincoumans
@Po-Jen
@mithi
@pantor
@pedrovhb
@jimaldon
@Gonzalo-Mier
@carlosjoserg
+ 23 contributors
Footer
© 2025 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information


## https://github.com/ahundt/awesome-robotics
Skip to content
Navigation Menu
Platform
Solutions
Resources
Open Source
Enterprise
Pricing

Search or jump to...
Sign in
Sign up
ahundt
/
awesome-robotics
Public
Code
Issues
Pull requests
3
Actions
Projects
Security
Insights
ahundt/awesome-robotics
Go to file
Name		
ahundt
ahundt
Merge pull request #5 from pantor/master
816a0c2
 · 
2 years ago
README.md
Merge pull request #5 from pantor/master
2 years ago
interesting.md
move pytorch3d to interesting list
5 years ago
papers.md
Concept2Robot added
5 years ago
Repository files navigation
README
Awesome Robotics
Awesome

Awesome links, software libraries, papers, and other intersting links that are useful for robots.

Relevant Awesome Lists
Kiloreaux/awesome-robotics - Learn about Robotics.
Robotics Libraries - Another list of awesome robotics libraries.
Robotics Coursework - A list of robotics courses you can take online
Computer Vision
Deep Learning - Neural networks.
TensorFlow - Library for machine intelligence.
Papers - The most cited deep learning papers.
Deep Vision - Deep learning for computer vision
Data Visualization - See what your robot is doing with any programming language.
paperswithcode state of the art - List of state of the art results on various machine learning benchmarks.
Simulators
CoppeliaSim - Create, Simulate, any Robot. (formerly named V-REP)
Microsoft Airsim - Open source simulator based on Unreal Engine for autonomous vehicles from Microsoft AI & Research.
Bullet Physics SDK - Real-time collision detection and multi-physics simulation for VR, games, visual effects, robotics, machine learning etc. Also see pybullet.
Visualization, Video, Display, and Rendering
Pangolin - A lightweight portable rapid development library for managing OpenGL display / interaction and abstracting video input.
PlotJuggler - Quickly plot and re-plot data on the fly! Includes optional ROS integration.
Data Visualization - A list of awesome data visualization tools.
Machine Learning
TensorFlow related
Keras - Deep Learning library for Python. Convnets, recurrent neural networks, and more. Runs on TensorFlow or Theano.
keras-contrib - Keras community contributions.
TensorFlow - An open-source software library for Machine Intelligence.
recurrentshop - Framework for building complex recurrent neural networks with Keras.
tensorpack - Neural Network Toolbox on TensorFlow.
tensorlayer - Deep Learning and Reinforcement Learning Library for Researchers and Engineers.
TensorFlow-Examples - TensorFlow Tutorial and Examples for beginners.
hyperas - Keras + Hyperopt: A very simple wrapper for convenient hyperparameter optimization.
elephas - Distributed Deep learning with Keras & Spark
PipelineAI - End-to-End ML and AI Platform for Real-time Spark and Tensorflow Data Pipelines.
sonnet - Google Deepmind APIs on top of TensorFlow.
visipedia/tfrecords - Demonstrates the use of TensorFlow's TFRecord data format.
Image Segmentation
tf-image-segmentation - Image Segmentation framework based on Tensorflow and TF-Slim library.
Keras-FCN
Logging and Messaging
spdlog - Super fast C++ logging library.
lcm - Lightweight Communications and Marshalling, message passing and data marshalling for real-time systems where high-bandwidth and low latency are critical.
Tracking
simtrack - A simulation-based framework for tracking.
ar_track_alvar - AR tag tracking library for ROS.
artoolkit5 - Augmented Reality Toolkit, which has excellent AR tag tracking software.
Robot Operating System (ROS)
ROS - Main ROS website.
ros2/design - Design documentation for ROS 2.0 effort.
Kinematics, Dynamics, Constrained Optimization
jrl-umi3218/Tasks - Tasks is library for real time control of robots and kinematic trees using constrained optimization.
jrl-umi3218/RBDyn - RBDyn provides a set of classes and functions to model the dynamics of rigid body systems.
ceres-solver - Solve Non-linear Least Squares problems with bounds constraints and general unconstrained optimization problems. Used in production at Google since 2010.
orocos_kinematics_dynamics - Orocos Kinematics and Dynamics C++ library.
flexible-collsion-library - Performs three types of proximity queries on a pair of geometric models composed of triangles, integrated with ROS.
robot_calibration - generic robot kinematics calibration for ROS
ruckig - Real-time, time-optimal and jerk-constrained online trajectory generation.
Calibration
handeye-calib-camodocal - generic robot hand-eye calibration.
robot_calibration - generic robot kinematics calibration for ROS
kalibr - camera and imu calibration for ROS
Reinforcement Learning
"Good Robot!": Efficient Reinforcement Learning for Multi-Step Visual Tasks with Sim to Real Transfer - A real robot completes multi-step tasks after <20k simulated actions. Good Robot on ArXiV (disclaimer: @ahundt is first author)
TensorForce - A TensorFlow library for applied reinforcement learning
gqcnn - Grasp Quality Convolutional Neural Networks (GQ-CNNs) for grasp planning using training datasets from the Dexterity Network (Dex-Net)
Guided Policy Search - Guided policy search (gps) algorithm and LQG-based trajectory optimization, meant to help others understand, reuse, and build upon existing work.
Drivers for Sensors, Devices and Arms
libfreenect2 - Open source drivers for the Kinect for Windows v2 and Xbox One devices.
iai_kinect2 - Tools for using the Kinect One (Kinect v2) in ROS.
grl - Generic Robotics Library: Cross platform drivers for Kuka iiwa and Atracsys FusionTrack with optional v-rep and ros drivers. Also has cross platform Hand Eye Calibration and Tool Tip Calibration.
Datasets
CoSTAR Block Stacking Dataset - Robot stacking colored children's blocks (disclaimer: created by @ahundt)
shapestacks - simulated stacks of colored children's objects
pascal voc 2012 - The classic reference image segmentation dataset.
openimages - Huge imagenet style dataset by Google.
COCO - Objects with segmentation, keypoints, and links to many other external datasets.
cocostuff - COCO additional full scene segmentation including backgrounds and annotator.
Google Brain Robot Data - Robotics datasets including grasping, pushing, and pouring.
Materials in Context - Materials Dataset with real world images in 23 categories.
Dex-Net 2.0 - 6.7 million pairs of synthetic point clouds and grasps with robustness labels.
Dataset Collection
LabelFusion - "A Pipeline for Generating Ground Truth Labels for Real RGBD Data of Cluttered Scenes" code
cocostuff - COCO additional full scene segmentation including backgrounds and annotator.
Linear Algebra & Geometry
Eigen - Eigen is a C++ template library for linear algebra: matrices, vectors, numerical solvers, and related algorithms.
Boost.QVM - Quaternions, Vectors, Matrices library for Boost.
Boost.Geometry - Boost.Geometry contains instantiable geometry classes, but library users can also use their own.
SpaceVecAlg - Implementation of spatial vector algebra for 3D geometry with the Eigen3 linear algebra library.
Sophus - C++ implementation of Lie Groups which are for 3D Geometry, using Eigen.
Point Clouds
libpointmatcher - An "Iterative Closest Point" library robotics and 2-D/3-D mapping.
Point Cloud Library (pcl) - The Point Cloud Library (PCL) is a standalone, large scale, open project for 2D/3D image and point cloud processing.
Simultaneous Localization and Mapping (SLAM)
ElasticFusion - Real-time dense visual SLAM system.
co-fusion - Real-time Segmentation, Tracking and Fusion of Multiple Objects. Extends ElasticFusion.
Google Cartographer - Cartographer is a system that provides real-time simultaneous localization and mapping (SLAM) in 2D and 3D across multiple platforms and sensor configurations.
OctoMap - An Efficient Probabilistic 3D Mapping Framework Based on Octrees. Contains the main OctoMap library, the viewer octovis, and dynamicEDT3D.
ORB_SLAM2 - Real-Time SLAM for Monocular, Stereo and RGB-D Cameras, with Loop Detection and Relocalization Capabilities.
License
Creative Commons License
This work is licensed under a Creative Commons Attribution 4.0 International License.

About
A curated list of awesome links and software libraries that are useful for robots.

Topics
lists list machine-learning awesome reinforcement-learning robot deep-learning robotics simulation tensorflow optimization physics point-cloud ros awesome-list sensors datasets image-segmentation optimization-algorithms planning-algorithms
Resources
 Readme
 Activity
Stars
 1.3k stars
Watchers
 46 watching
Forks
 171 forks
Report repository
Releases
No releases published
Packages
No packages published
Contributors
6
@ahundt
@mithi
@pantor
@shdblowers
@mmatteo-hub
Footer
© 2025 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information


## https://github.com/kiloreux/awesome-robotics
Skip to content
Navigation Menu
Platform
Solutions
Resources
Open Source
Enterprise
Pricing

Search or jump to...
Sign in
Sign up
kiloreux
/
awesome-robotics
Public
Code
Issues
4
Pull requests
15
Actions
Projects
Wiki
Security
Insights
kiloreux/awesome-robotics
Go to file
Name		
tanij
tanij
Update README.md (#73)
067f76e
 · 
last year
.gitignore
Add related awesome lists
10 years ago
CONTRIBUTING.md
fix a couple of typos, improve capitalization, remove trailing whites…
10 years ago
LICENSE.md
Added license and contribution guideline
10 years ago
README.md
Update README.md (#73)
last year
_config.yml
Set theme jekyll-theme-slate
6 years ago
Repository files navigation
README
Contributing
License
Awesome Robotics
Awesome

This is a list of various books, courses and other resources for robotics. It's an attempt to gather useful material in one place for everybody who wants to learn more about the field.

Courses
Artificial Intelligence for Robotics Udacity
Robotics Nanodegree Udacity 💵
Autonomous Mobile Robots edX
Underactuated Robotics MIT CSAIL
Autonomous Mobile Robots edX
Robot Mechanics and Control, Part I edX
Robot Mechanics and Control, Part II edX
Autonomous Navigation for Flying Robots edX
Robotics Specialization by GRASP Lab Coursera 💵
Control of Mobile Robots Coursera
QUT Robot Academy QUT
Robotic vision QUT
Introduction to robotics MIT
Robotics: Vision Intelligence and Machine Learning edX
Applied robot design Stanford University
Introduction to Robotics Stanford University
Introduction to Mobile Robotics University of Freiburg
Robotics edx 💵
Columbia Robotics edx
Modern Robotics: Mechanics, Planning, and Control Coursera
Hello (Real) World with ROS – Robot Operating System edx
Advanced Robotics UCBerkeley
Building Arduino robots and devices Coursera
Introduction to The Robot Operating System (ROS2) Coursera
Modern Robotics: Mechanics, Planning, and Control Specialization Coursera
Become a Robotics Software Enginee Udacity
Advanced Robotics UC Berkeley
Self-Driving Cars with Duckietown edX
Books
Probabilistic Robotics (Intelligent Robotics and Autonomous Agents series) 💵
Introduction to Autonomous Mobile Robots (Intelligent Robotics and Autonomous Agents series) 💵
Springer Handbook of Robotics 💵
Planning Algorithms
A gentle introduction to ROS
A Mathematical Introduction to Robotic Manipulation
Learning Computing With Robots
Robotics, Vision and Control: Fundamental Algorithms in MATLAB (Springer Tracts in Advanced Robotics) 💵
INTECH Books
Introduction to Autonomous Robots
Principles of Robot Motion: Theory, Algorithms, and Implementations 💵
Introduction to Modern Robotics: Mechanics, Planning, and Control [pdf]
Programming Robots with ROS: A Practical Introduction to the Robot Operating System 💵
Learning ROS for Robotics Programming 💵
Mastering ROS for Robotics Programming 💵
Behavior Trees in Robotics and AI: An Introduction [pdf]
Automated Planning and Acting [pdf]
Robotics for Software Engineers 💵
Software and Libraries
Gazebo Robot Simulator

ROS The Robot Operating System (ROS) is a flexible framework for writing robot software. It is a collection of tools, libraries, and conventions that aim to simplify the task of creating complex and robust robot behavior across a wide variety of robotic platforms.

ROS2 ROS2 is a new version of ROS with radical design changes and improvement over older ROS version.

RobWork RobWork is a collection of C++ libraries for simulation and control of robot systems. RobWork is used for research and education as well as for practical robot applications.

MRPT Mobile Robot Programming Toolkit provides developers with portable and well-tested applications and libraries covering data structures and algorithms employed in common robotics research areas.

Robotics Library The Robotics Library (RL) is a self-contained C++ library for robot kinematics, motion planning and control. It covers mathematics, kinematics and dynamics, hardware abstraction, motion planning, collision detection, and visualization.

Simbad 2D/3D simulator in Java and Jython.

Morse General purpose indoor/outdoor 3D simulator.

Carmen CARMEN is an open-source collection of software for mobile robot control. CARMEN is modular software designed to provide basic navigation primitives including: base and sensor control, logging, obstacle avoidance, localization, path planning, and mapping.

Peekabot Peekabot is a real-time, networked 3D visualization tool for robotics, written in C++. Its purpose is to simplify the visualization needs faced by a roboticist daily.

YARP Yet Another Robot Platform.

V-REP Robot simulator, 3D, source available, Lua scripting, APIs for C/C++, Python, Java, Matlab, URBI, 2 physics engines, full kinematic solver.

Webots Webots is a development environment used to model, program and simulate mobile robots.

Drake A planning, control and analysis toolbox for nonlinear dynamical systems.

Neurorobotics Platform (NRP) An Internet-accessible simulation system that allows the simulation of robots controlled by spiking neural networks.

The Player Project Free Software tools for robot and sensor applications

Open AI's Roboschool Open-source software for robot simulation, integrated with OpenAI Gym.

ViSP Open-source visual servoing platform library, is able to compute control laws that can be applied to robotic systems.

ROS Behavior Trees Open-source library to create robot's behaviors in form of Behavior Trees running in ROS (Robot Operating System).

g2core Open-source motion control software for CNC and Robotics, designed to run on Arduino Due class microcontrollers.

ur5controller Open-source OpenRAVE controller for UR5 robot integrated with ROS.

RBDL Open-source (zlib) C++ libray for both forward and inverse dynamics and kinematics. Also supports contacts and loops.

Unity Robotics Hub Central repository for open-source Unity packages, tutorials, and other resources demonstrating how to use Unity for robotics simulations. Includes new support for ROS integration.

Papers
Optimization Based Controller Design and Implementation for the Atlas Robot in the DARPA Robotics Challenge Finals
Conferences
ACM/IEEE International Conference on Human Robot Interaction (HRI)
CISM IFToMM Symposium on Robot Design, Dynamics and Control (RoManSy)
IEEE Conference on Decision and Controls (CDC)
IEEE International Conference on Rehabilitation Robotics (ICORR)
IEEE International Conference on Robotics and Automation (ICRA)
IEEE/RSJ International Conference on Intelligent Robots and Systems (IROS)
IEEE-RAS International Conference on Humanoid Robots (Humanoids)
International Symposium of Robotic Research (ISRR)
International Symposium of Experimental Robotics (ISER)
Robotica
Robotics: Science and Systems Conference (RSS)
The International Workshop on the Algorithmic Foundations of Robotics (WAFR)
Journals
Autonomous Robots
Bioinspiration & Biomimetics
Frontiers in Robotics and AI
IEEE Robotics & Automation Magazine
IEEE Transactions on Haptics
IEEE Transactions on Robotics
IEEE/ASME Transactions on Mechatronics
International Journal of Social Robotics
Journal of Field Robotics
Journal of Intelligent & Robotic Systems
Mechatronics
Robotics and Computer-Integrated Manufacturing
Robotics and Autonomous Systems
The International Journal of Robotics Research
Competitions
ICRA Robot Challenges
RobotChallenge
DARPA Robotics Challenge
European Robotics Challenges
First Robotics Competition
VEX Robotics Competition
RoboCup
RoboCupJunior
Eurobot International Students Robotics Contest
RoboMasters
RoboSoft, Grand Challenge
Intelligent Ground Vehicle Competition
Robotex The biggest robotics festival in Europe
First Lego League
Companies
Boston Dynamics robotics R&D company, creator of the state of the art Atlas and Spot robots
iRobot manufacturer of the famous Roomba robotic vacuum cleaner
PAL Robotics
Aldebaran Robotics creator of the NAO robot
ABB Robotics the largest manufacturer of industrial robots
KUKA Robotics major manufacturer of industrial robots targeted at factory automation
FANUC industrial robots manufacturer with the biggest install base
Rethink Robotics creator of the collaborative robot Baxter
DJI industry leader in drones for both commerical and industrial needs.
The construct sim A cloud based tool for building modern, future-proof robot simulations.
Fetch Robotics A robotics startup in San Jose, CA building the future of e-commerce fulfillment and R&D robots.
Festo Robotics Festo is known for making moving robots that move like animals such as the sea gull like SmartBird, jellyfish, butterflies and kangaroos.
Neobotix manufacturer of industrial, research and as well as custom mobile robots.
Misc
IEEE Spectrum Robotics robotics section of the IEEE Spectrum magazine
MIT Technology Review Robotics robotics section of the MIT Technology Review magazine
reddit robotics subreddit
RosCON conference (video talks included)
Carnegie Mellon Robotics Academy
Let's Make Robots
How do I learn Robotics?
Free NXT Lego MindStorms NXT-G code tutorials
StackExachange Robotics community
47 Programmable robotic kits
Linorobot A suite of DIY ROS compatible robots
Hexapod Robot Simulator - Solve and visualize hexapod robot inverse kinematics and gaits in the web
PythonRobotics - Implementations of various robotics algorithms in python
Related awesome lists
Awesome Artificial Intelligence
Awesome Computer Vision
Awesome Machine Learning
Awesome Deep Learning
Awesome Deep Vision
Awesome Gazebo
Awesome Reinforcement Learning
Awesome Robotics
Awesome Robotics Libraries
Awesome ROS2
Awesome RoboCupJunior Soccer
About
A list of awesome Robotics resources

Topics
robotics
Resources
 Readme
License
 View license
Contributing
 Contributing
 Activity
Stars
 5.3k stars
Watchers
 225 watching
Forks
 890 forks
Report repository
Releases
No releases published
Packages
No packages published
Contributors
32
@kiloreux
@miccol
@kelvin-sudani
@mithi
@jslee02
@siddarth09
@justinclift
@sandyleo26
@mrshu
@martinfelis
@Adman
@muratkrty
@kennethlarsen
@lucbettaieb
+ 18 contributors
Footer
© 2025 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information

## https://github.com/AGV-IIT-KGP/awesome-motion-planning
Skip to content
Navigation Menu
Platform
Solutions
Resources
Open Source
Enterprise
Pricing

Search or jump to...
Sign in
Sign up
AGV-IIT-KGP
/
awesome-motion-planning
Public
Code
Issues
3
Pull requests
Actions
Projects
Wiki
Security
Insights
AGV-IIT-KGP/awesome-motion-planning
Go to file
Name		
hari-sikchihargup
hari-sikchi
and
hargup
Added Hybrid A* links (#7)
91b529f
 · 
last year
LICENSE
Initial commit
11 years ago
README.md
Added Hybrid A* links (#7)
last year
Repository files navigation
README
MIT license
Awesome Motion Planning
Join the chat at https://gitter.im/AGV-IIT-KGP/awesome-motion-planning

An attempt to collect a curated list of awesome learning resources, research papers, tools and other resources related to Motion Planning. This is inpired from several such lists in programming community.

If you want to contribute to this list (please do), send a pull request, open an issue When sending suggestions please add a short blurb/description about each book that you have personally read/benefited from. Feel free to debate quality, headings, etc. irrespective of any particular field or subject area.

All the resources need not be freely available for download.

Blogs and Tutorials
Introduction to A-star
Toward More Realistic Pathfinding
Overview of Motion Planning
A* Path Finding for Beginners By Patrick Lester
Hybrid A* Implementation
Dubins Path
Books
Planning Algorithms By Steven M. LaValle
Robot Motion Planning By Jean-Claude Latombe
Autonomus Robots: Modeling, Path Planning, and Control by Farbod Fahimi
Principles of Robot Motion By Howie Choset, Kevin M. Lynch, Seth Hutchinson, George A. Kantor, Wolfram Burgard, Lydia E. Kavraki and Sebastian Thrun
Papers
Randomized Kinodynamic Planning by Steven M. LaValle and James J. Kuffner,
Limited-Damage A*: A path search algorithm that considers damage as a feasibility criterion by Serhat Bayili, Faruk Polat
Real Time Continuous Curvature Path Planner for an Autonomous Vehicle in an Urban Environment by David Knowles
An Evolutionary Artificial Potential Field Algorithm for Dynamic Path Planning of Mobile Robot by Cao Qixin, Huang Yanwen, Zhou Jingliang
Planning continuous-curvature paths for car-like robots by Scheuer A, Fraichard T
Optimal and Efficient Path Planning for Partially-Known Environments by Anthony Stentz
An Introduction to the Conjugate Gradient Method Without the Agonizing Pain by Jonathan Richard Shewchuk
Practical search techniques in path planning for autonomous driving
Junior The Stanford entry in the urban challenge
Heuristic Search
A Formal Basis for the Heuristic Determination of Minimum Cost Paths - The original A* paper. Introduces the ideas of consistency and admissibility. Also has proofs for the optimality of A*.
On the complexity of Admissible Search Algorithms - A* has worst-case performance with an admisible by inconsistent heuristic. This algorithm deals with such heuristics and improves the worst-case performance.
A Heuristic Search Algorithm with Modifiable Estimate - Most algorithms derived from A* consider the heuristic cost h(s) to be a constant. This is the first algorithm that treats the heuristic cost as a variable and improves it during search whenever possible. The paper also has an influential proof of a result that says that no overall optimal algorithm exits if the cost of an algorithm is measured by the total number of node expansions.
Lecture Notes
Robot Motion Planning Lectures By Howie Choset.
Planning and Decision Making in Robotics By Maxim Likhachev.
Software Packages and Libraries
OMPL: Sampling based planning
SBPL: Heuristic search based planning
SMPL: Heuristic search based planning for manipulators
About
A curated list of Resources for Motion Planning

Resources
 Readme
License
 MIT license
 Activity
 Custom properties
Stars
 217 stars
Watchers
 46 watching
Forks
 53 forks
Report repository
Releases
No releases published
Packages
No packages published
Contributors
5
@hargup
@abinashmeher999
@shivamvats
@gitter-badger
@hari-sikchi
Footer
© 2025 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information


## https://github.com/jslee02/awesome-multibody-dynamics-simulation
Skip to content
Navigation Menu
Platform
Solutions
Resources
Open Source
Enterprise
Pricing

Search or jump to...
Sign in
Sign up
jslee02
/
awesome-multibody-dynamics-simulation
Public
Code
Issues
Pull requests
Actions
Security
Insights
jslee02/awesome-multibody-dynamics-simulation
Go to file
Name		
jslee02
jslee02
Add I-Cloth
3b611e2
 · 
6 years ago
LICENSE
Update LICENSE
8 years ago
README.md
Add I-Cloth
6 years ago
READ_LATER.md
Create READ_LATER.md
7 years ago
Repository files navigation
README
CC0-1.0 license
Awesome Multibody Dynamics Simulation
A curated list of resources for multibody dynamics simulation

Papers
1. Multibody Dynamics Formulation
Geometric Formulation
A Recursive Multibody Dynamics and Sensitivity Algorithm for Branched Kinematic Chains (2001), G Sohl and J. Bobrow. [pdf]
Coordinate-invariant Algorithms for Robot Dynamics (1999), S. Ploen and F. Park. [pdf]
A Lie Group Formulation of Robot Dynamics (1995), F. Park et al. [pdf]
Geometric Integration
Geometric Integration on Euclidean Group with Application to Articulated Multibody Systems (2005), J. Park and W.-K. Chung. [pdf]
Inverse Dynamics
Inverse Dynamics with Rigid Contact and Friction (2017), S. Zapolsky and E. Drumwright. [pdf]
2. Contact / Collision
Resolving Force Indeterminacy in Contact Dynamics Using Compatibility Conditions (2018), T. Olsen and K. Kamrin. [pdf]
Posing Multibody Dynamics with Friction and Contact as a Differential Complementarity Problem (2018), D. Negrut et al. [pdf]
Analysis and Computation of Two Body Impact in Three Dimensions (2017), Y.-B. Jia and F. Yang. [pdf]
Rigid Body Contact Problems using Proximal Operators (2017), K. Erleben. [pdf]
Making a Meaningful Impact: Modelling Simultaneous Frictional Collisions in Spatial Multibody Systems (2015), T. Uchida et al. [pdf]
Performance of a Method for Formulating Geometrically Exact Complementarity Constraints in Multibody Dynamic Simulation (2015), D. Flickinger et al. [pdf]
What’s Wrong with Collision Detection in Multibody Dynamics Simulation? (2013), D. Flickinger et al. [pdf]
Modeling Contact Friction and Joint Friction in Dynamic Robotic Simulation using the Principle of Maximum Dissipation (2011), E. Drumwright and D. Shell. [pdf]
Staggered Projections for Frictional Contact in Multibody Systems (2008), D. Kaufman et al. [pdf]
Velocity-Based Shock Propagation for Multibody Dynamics Animation (2007), K. Erleben. [pdf]
An Implicit Time-Stepping Scheme for Rigid Body Dynamics with Inelastic Collisions and Coulomb Friction (1996), D. Stewart and J. Trinkle. [pdf]
Impulse-based Simulation of Rigid Bodies (1995), B. Mirtich and J. Canny. [pdf]
Non-LCP based Methods
Multi-contact Frictional Rigid Dynamics using Impulse Decomposition (2017), S. Li et al. [pdf]
Fast Frictional Dynamics for Rigid Bodies (2005), D. Kaufman et al. [pdf]
Simultaneous Contact
All's Well That Ends Well: Guaranteed Resolution of Simultaneous Rigid Body Impact (2017), E. Vouga et al. [pdf]
Quadratic Contact Energy Model for Multi-impact Simulation (2015), T. Zhang et al. [pdf]
Reflections on Simultaneous Impact (2012), B. Smith et al. [pdf]
Non-uniform Coefficient of Restitution Model
Bounce Maps: An Improved Restitution Model for Real-Time Rigid-Body Impact (2017), J.-H. Wang et al. [pdf] [video]
3. Discrete Mechanics / Variational Integrators
Core / Overview
General Techniques for Constructing Variational Integrators (2011), M. Leok and T. Shingel. [pdf]
An Overview of Variational Integrators (2003), A. Lew et al. [pdf]
Discrete Mechanics and Variational Integrators (2001), J. Marsden and M. West. [pdf]
Geometric Formulation
Dual Quaternion Variational Integrator for Rigid Body Dynamic Simulation (2016), J. Xu and K. Halse. [arXiv]
Discrete Geometric Optimal Control on Lie Groups (2011), M. Kobilarov and J. Marsden. [pdf]
High Order Convergence
Surrogate Lagrangians for Variational Integrators: High Order Convergence with Low Order Schemes (20017), G. Torre and T. Murphey. [pdf]
Constrained Variational Integrators
Hamilton's Principle as Variational Inequality for Mechanical Systems with Impact (2016), R. Leine et al. [pdf]
Study of Newton's Cradle using a New Discrete Approach (2015), A. Rodriguez and A Bowling. [pdf]
A Propagative Model of Simultaneous Impact: Existence, Uniqueness, and Design Consequences (2014), V. Seghete and T. Murphey. [pdf]
Variational Solutions to Simultaneous Collisions between Multiple Rigid Bodies (2010), V. Seghete and T. Murphey. [pdf]
Multiple Instantaneous Collisions in a Variational Framework (2009), V. Seghete and T. Murphey. [pdf]
Variational Collision Integrators and Optimal Control (2008), D Pekarek and J. Marsden. [pdf]
Variational Integrators for Constrained Dynamical Systems (2008), S. Leyendecker et al. [pdf]
Nonsmooth Lagrangian Mechanics and Variational Collision Integrators (2003), R. Fetecau et al. [pdf]
Time-discretized Variational Formulation of Non-smooth Frictional Contact (2002), A. Pandolfi et al. [pdf]
Multibody Dynamics
A Linear-Time Variational Integrator for Multibody Systems (2016), J. Lee et al. [pdf]
Scalable Variational Integrators for Constrained Mechanical Systems in Generalized Coordinates (2009), E. Johnson and T. Murphey. [pdf]
Adaptive Time-stepping / Asynchronous Integration
A variational approach to multirate integration for constrained systems (2013), S. Leyendecker and S. Ober-Blobaum. [pdf]
Asynchronous Variational Integrators (2003), A. Lew et al. [pdf]
Stochastic Mechanics
Stochastic Variational Integrators (2008), N. Bou-Rabee and H. Owhadi. [pdf]
Trajectory Optimization / DMOC
Autonomous Suspended Load Operations via Trajectory Optimization and Variational Integrators (2017), G. Torre et al. [pdf]
On the Benefits of Surrogate Lagrangians in Optimal Control and Planning Algorithms (2016), G. Torre and T. Murphey. [pdf]
ETC
Modified equations for variational integrators applied to Lagrangians linear in velocities (2017), M. Vermeeren. [pdf]
Variational Integrators for Structure-Preserving Filtering (2016), J. Schultz et al.
4. Position Based Dynamics
ADMM ⊇ Projective Dynamics: Fast Simulation of General Constitutive Models (2016), R. Narain et al. [pdf]
XPBD: Position-Based Simulation of Compliant Constrained Dynamics (2016), M. Macklin et al. [pdf]
Stable Constrained Dynamics (2015), M. Tournier et al. [pdf]
Position-Based Rigid Body Dynamics (2014), C. Deul et al. [pdf]
Projective Dynamics: Fusing Constraint Projections for Fast Simulation (2014), S. Bouaziz et al. [pdf]
Position Based Dynamics (2007), M. Müller et al. [pdf]
5. Deformable Body / Granular / Fluid Simulation
Towards Real-time Simulation of Hyperelastic Materials (2016), T. Liu et al. [pdf]
Interactive Constrained Dynamics for Rigid and Deformable Objects (2015), L. Vezzaro et al. [pdf]
6. Inverse Kinematics
FABRIK: A Fast, Iterative Solver for the Inverse Kinematics Problem (2011), A. Aristidou and J. Lasenby. [pdf]
Fast Resolution of Hierarchized Inverse Kinematics with Inequality Constraints (2010), A. Escande et al. [pdf]
An Inverse Kinematic Architecture Enforcing an Arbitrary Number of Strict Priority Levels (2003), P. Baerlocher and R. Boulic. [pdf]
7. Trajectory Optimization
Motion Planning with Sequential Convex Optimization and Convex Collision Checking (2014), J. Schulman et al. [pdf] [more]
Newton-Type Algorithms for Dynamics-Based Robot Movement Optimization (2005), S.-H. Lee et al. [pdf]
8. Applications
SMASH: Physics-guided Reconstruction of Collisions from Videos (2017), A. Monszpart et al. [pdf] [video]
9. Survey
Interactive Simulation of Rigid Body Dynamics in Computer Graphics (2014), J. Bender et al. [pdf]
A Survey on Position-Based Simulation Methods in Computer Graphics (2014), J. Bender et al. [pdf]
10. Vehicle Dynamics
Terramechanics-based high-fidelity dynamics simulation for wheeled mobile robot on deformable rough terrain (2010), L. Ding et al. [pdf]
Tire/Road model
Integrated Longitudinal and Lateral Tire/Road Friction Modeling and Monitoring for Vehicle Motion Control (2006), L. Li et al. [pdf]
11. Cloth Simulation
I-Cloth: Incremental Collision Handling for GPU-Based Interactive Cloth Simulation (2018), M. Tang et al. [[project](I-Cloth: Incremental Collision Handling for GPU-Based Interactive Cloth Simulation)]
Thesis
Discrete Mechanics and Optimal Control for Space Trajectory Design (2011), A. Moore. [pdf]
Stable, Robust, and Versatile Multibody Dynamics Animation (2004), K. Erleben. [pdf]
Slides / Lectures
Multibody Dynamics Animation, K. Erleben. [pdf]
Thesis
Variational Integrators (2004), M. West. [pdf]
Books
Modern Robotics: Mechanics, Planning, and Control (2017), K. Lynch and F. Park. [pdf]
Numerical Methods for Linear Complementarity Problems in Physics-Based Animation (2015), S. Niebe and K. Erleben. [pdf]
Guide to Dynamic Simulations of Rigid Bodeis and Particle Systems (2012), M. Coutinho. [web]
Rigid Body Dynamics Algorithms (2008), R. Featherstone. [pdf]
A Mathematical Introduction to Robotic Manipulation (1994), R. Murray et al. [pdf]
The Linear Complementarity Problem (1992), R. Cottle et al. [web]
Relevant Awesome Lists
Awesome Robotics (ahundt)
Awesome Robotics (Kiloreux)
Awesome Robotics Libraries
Awesome Collision Detection
Awesome Gazebo
License
CC0

About
😎 A curated list of resources for multibody dynamics simulation papers

jslee02.github.io/awesome-multibody-dynamics-simulation/
Topics
robotics simulation awesome-list multibody-dynamics robotics-simulation
Resources
 Readme
License
 CC0-1.0 license
 Activity
Stars
 89 stars
Watchers
 9 watching
Forks
 8 forks
Report repository
Releases
No releases published
Packages
No packages published
Footer
© 2025 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information


## https://github.com/Ly0n/awesome-robotic-tooling
Skip to content
Navigation Menu
Platform
Solutions
Resources
Open Source
Enterprise
Pricing

Search or jump to...
Sign in
Sign up
Ly0n
/
awesome-robotic-tooling
Public
Code
Issues
2
Pull requests
5
Actions
Projects
Security
Insights
Ly0n/awesome-robotic-tooling
Go to file
Name		
Ly0n
Ly0n
Merge pull request #48 from nachovizzo/patch-1
dc73ead
 · 
2 years ago
.github/workflows
Create tweet.yml
5 years ago
docs
add Twitter header
5 years ago
CONTRIBUTING.md
Update CONTRIBUTING.md
5 years ago
LICENSE
Create LICENSE
5 years ago
README.md
Add KISS-ICP
2 years ago
mkdocs.yml
add Twitter header
5 years ago
Repository files navigation
README
Contributing
CC0-1.0 license
Awesome Robotic Tooling Awesome
A curated list of tooling for professional robotic development in C++ and Python with a touch of ROS, autonomous driving and aerospace

To stop reinventing the wheel you need to know about the wheel. This list is an attempt to show the variety of open and free tools in software and hardware development, which are useful in professional robotic development.

Your contribution is necessary to keep this list alive, increase the quality and to expand it. You can read more about it's origin and how you can participate in the contribution guide and related blog post. All new project entries will have a tweet from protontypes.



 Join the chat at https://gitter.im/protontypes/community

Contents
Communication and Coordination
Documentation and Presentation
Requirements and Safety
Architecture and Design
Frameworks and Stacks
Development Environment
Code and Run
Template
Build and Deploy
Unit and Integration Test
Lint and Format
Debugging and Tracing
Version Control
Simulation
Electronics and Mechanics
Sensor Processing
Calibration and Transformation
Perception Pipeline
Machine Learning
Parallel Processing
Image Processing
Radar Processing
Lidar and Point Cloud Processing
Localization and State Estimation
Simultaneous Localization and Mapping
Lidar
Visual
Vector Map
Prediction
Behavior and Decision
Planning and Control
User Interaction
Graphical User Interface
Acoustic User Interface
Command Line Interface
Data Visualization and Mission Control
Annotation
Point Cloud
RViz
Operation System
Monitoring
Database and Record
Network Distributed File System
Server Infrastructure and High Performance Computing
Embedded Operation System
Real-Time Kernel
Network and Middleware
Ethernet and Wireless Networking
Controller Area Network
Sensor and Acuator Interfaces
Security
Datasets
Communication and Coordination
Agile Development - Manifesto for Agile Software Development.
Gitflow - Makes parallel development very easy, by isolating new development from finished work.
DeepL - An online translator that outperforms Google, Microsoft and Facebook.
Taiga - Agile Projectmanagment Tool.
Kanboard - Minimalistic Kanban Board.
kanban - Free, open source, self-hosted, Kanban board for GitLab issues.
Gitlab - Simple Selfhosted Gitlab Server with Docker.
Gogs - Build a simple, stable and extensible self-hosted Git service that can be setup in the most painless way.
Wekan - Meteor based Kanban Board.
JIRA API - Python Library for REST API of Jira.
Taiga API - Python Library for REST API of Taiga.
Chronos-Timetracker - Desktop client for JIRA. Track time, upload worklogs without a hassle.
Grge - Grge is a daemon and command line utility augmenting GitLab.
gitlab-triage - Gitlab's issues and merge requests triage, automated.
Helpy - A modern, open source helpdesk customer support application.
ONLYOFFICE - A free open source collaborative system developed to manage documents, projects, customer relationship and email correspondence, all in one place.
discourse - A platform for community discussion. Free, open, simple.
Gerrit - A code review and project management tool for Git based projects.
jitsi-meet - Secure, Simple and Scalable Video Conferences that you use as a standalone app or embed in your web application.
mattermost - An open source, private cloud, Slack-alternative.
openproject - The leading open source project management software.
leantime - Leantime is a lean project management system for innovators.
gitter - Gitter is a chat and networking platform that helps to manage, grow and connect communities through messaging, content and discovery.
Documentation and Presentation
Typora - A Minimalist Markdown Editor.
Markor - A Simple Markdown Editor for your Android Device.
Pandoc - Universal markup converter.
Yaspeller - Command line tool for spell checking.
ReadtheDocs - Build your local ReadtheDocs Server.
Doxygen - Doxygen is the de facto standard tool for generating documentation from annotated C++ sources.
Sphinx - A tool that makes it easy to create intelligent and beautiful documentation for Python projects.
Word-to-Markdown - A ruby gem to liberate content from Microsoft Word document.
paperless - Index and archive all of your scanned paper documents.
carbon - Share beautiful images of your source code.
undraw - Free Professional business SVGs easy to customize.
asciinema - Lets you easily record terminal sessions and replay them in a terminal as well as in a web browser.
inkscape - Inkscape is a professional vector graphics editor for Linux, Windows and macOS.
Reveal-Hugo - A Hugo theme for Reveal.js that makes authoring and customization a breeze. With it, you can turn any properly-formatted Hugo content into a HTML presentation.
Hugo-Webslides - This is a Hugo template to create WebSlides presentation using markdown.
jupyter2slides - Cloud Native Presentation Slides with Jupyter Notebook + Reveal.js.
patat - Terminal-based presentations using Pandoc.
github-changelog-generator - Automatically generate change log from your tags, issues, labels and pull requests on GitHub.
GitLab-Release-Note-Generator - A Gitlab release note generator that generates release note on latest tag.
OCRmyPDF - Adds an OCR text layer to scanned PDF files, allowing them to be searched.
papermill - A tool for parameterizing, executing, and analyzing Jupyter Notebooks.
docsy - An example documentation site using the Docsy Hugo theme.
actions-hugo - Deploy website based on Hugo to GitHub Pages.
overleaf - An open-source online real-time collaborative LaTeX editor.
landslide - Generate HTML5 slideshows from markdown, ReST, or textile.
libreoffice-impress-templates - Freely-licensed LibreOffice Impress templates.
opensourcedesign - Community and Resources for Free Design and Logo Creation.
olive - A free non-linear video editor aiming to provide a fully-featured alternative to high-end professional video editing software.
buku - Browser-independent bookmark manager.
swiftlatex - A WYSIWYG Browser-based LaTeX Editor.
ReLaXed - Allows complex PDF layouts to be defined with CSS and JavaScript, while writing the content in a friendly, minimal syntax close to Markdown or LaTeX.
foam - Foam is a personal knowledge management and sharing system inspired by Roam Research, built on Visual Studio Code and GitHub.
CodiMD - Open Source Online Real-time collaborate on team documentation in markdown.
jupyter-book - Build interactive, publication-quality documents from Jupyter Notebooks.
InvoiceNet - Deep neural network to extract intelligent information from invoice documents.
tesseract - Open Source OCR Engine.
mkdocs - A fast, simple and downright gorgeous static site generator that's geared towards building project documentation.
PlotNeuralNet - Latex code for drawing neural networks for reports and presentation.
Excalidraw - Virtual whiteboard for sketching hand-drawn like diagrams.
SVGrepo - Download free SVG Vectors for commercial use.
gollum - A simple, Git-powered wiki with a sweet API and local frontend.
GanttLab - The easy to use, fully functional Gantt chart for GitLab and GitHub.
Zotero - A free, easy-to-use tool to help you collect, organize, cite, and share your research sources.
Requirements and Safety
awesome-safety-critical - List of resources about programming practices for writing safety-critical software.
open-autonomous-safety - OAS is a fully open-source library of Voyage's safety processes and testing procedures, designed to supplement existing safety programs at self-driving car startups across the world.
CarND-Functional-Safety-Project - Create functional safety documents in this Udacity project.
Automated Valet Parking Safety Documents - Created to support the safe testing of the Automated Valet Parking function using the StreetDrone test vehicle in a car park.
safe_numerics - Replacements to standard numeric types which throw exceptions on errors.
Air Vehicle C++ development coding standards - Provide direction and guidance to C++ programmers that will enable them to employ good programming style and proven programming practices leading to safe, reliable, testable, and maintainable code.
AUTOSAR Coding Standard - Guidelines for the use of the C++14 language in critical and safety-related system.
The W-Model and Lean Scaled Agility for Engineering - Ford applied an agile V-Model method from Vector that can be used in safety related project management.
doorstop - Requirements management using version control.
capella - Comprehensive, extensible and field-proven MBSE tool and method to successfully design systems architecture.
robmosys - RobMoSys envisions an integrated approach built on top of the current code-centric robotic platforms, by applying model-driven methods and tools.
Papyrus for Robotics - A graphical editing tool for robotic applications that complies with the RobMoSys approach.
fossology - A toolkit you can run license, copyright and export control scans from the command line.
ScenarioArchitect - The Scenario Architect is a basic python tool to generate, import and export short scene snapshots.
Architecture and Design
Guidelines - How to architect ROS-based systems.
yEd - A powerful desktop application that can be used to quickly and effectively generate high-quality diagrams.
yed_py - Generates graphML that can be opened in yEd.
Plantuml - Web application to generate UML diagrams on-the-fly in your live documentation.
rqt_graph - Provides a GUI plugin for visualizing the ROS computation graph.
rqt_launchtree - An RQT plugin for hierarchical launchfile configuration introspection.
cpp-dependencies - Tool to check C++ #include dependencies (dependency graphs created in .dot format).
pydeps - Python Module Dependency graphs.
aztarna - A footprinting tool for robots.
draw.io - A free online diagram software for making flowcharts, process diagrams, org charts, UML, ER and network diagrams.
vscode-drawio - This extension integrates Draw.io into VS Code.
Architecture_Decision_Record - A document that captures an important architectural decision made along with its context and consequences.
Frameworks and Stacks
ROS - (Robot Operating System) provides libraries and tools to help software developers create robot applications.
awesome-ros2 - A curated list of awesome Robot Operating System Version 2.0 (ROS 2) resources and libraries.
Autoware.Auto - Autoware.Auto applies best-in-class software engineering for autonomous driving.
Autoware.ai - Autoware.AI is the world's first "All-in-One" open-source software for autonomous driving technology.
OpenPilot - Open Source Adaptive Cruise Control (ACC) and Lane Keeping Assist System (LKAS).
Apollo - High performance, flexible architecture which accelerates the development, testing, and deployment of Autonomous Vehicles.
PythonRobotics - This is a Python code collection of robotics algorithms, especially for autonomous navigation.
Stanford Self Driving Car Code - Stanford Code From Cars That Entered DARPA Grand Challenges.
astrobee - Astrobee is a free-flying robot designed to operate as a payload inside the International Space Station (ISS).
CARMAPlatform - Enables cooperative automated driving plug-in.
Automotive Grade Linux - Automotive Grade Linux is a collaborative open source project that is bringing together automakers, suppliers and technology companies to accelerate the development and adoption of a fully open software stack for the connected car.
PX4 - An open source flight control software for drones and other unmanned vehicles.
KubOS - An open-source software stack for satellites.
mod_vehicle_dynamics_control - TUM Roborace Team Software Stack - Path tracking control, velocity control, curvature control and state estimation.
Aslan - Open source self-driving software for low speed environments.
open-source-rover - A build-it-yourself, 6-wheel rover based on the rovers on Mars from JPL.
pybotics - An open-source and peer-reviewed Python toolbox for robot kinematics and calibration.
makani - Contains the working Makani flight simulator, controller (autopilot), visualizer, and command center flight monitoring tools.
mir_robot - This is a community project to use the MiR Robots with ROS.
COMPAS - Robotic fabrication package for the COMPAS Framework.
JdeRobot Academy - JdeRobot Academy is an open source collection of exercises to learn robotics in a practical way.
clover - ROS-based framework and RPi image to control PX4-powered drones.
ArduPilot - Open source control software for autonomous vehicles - copters/planes/rovers/boats/submersibles.
F Prime - A component-driven framework that enables rapid development and deployment of spaceflight and other embedded software applications.
Development Environment
Code and Run
Vim-ros - Vim plugin for ROS development.
Visual Studio Code - Code editor for edit-build-debug cycle.
atom - Hackable text editor for the 21st century.
Teletype - Share your workspace with team members and collaborate on code in real time in Atom.
Sublime - A sophisticated text editor for code, markup and prose.
ade-cli - The ADE Development Environment (ADE) uses docker and Gitlab to manage environments of per project development tools and optional volume images.
recipe-wizard - A Dockerfile generator for running OpenGL (GLX) applications with nvidia-docker2, CUDA, ROS, and Gazebo on a remote headless server system.
Jupyter ROS - Jupyter widget helpers for ROS, the Robot Operating System.
ros_rqt_plugin - The ROS Qt Creator Plug-in for Python.
xeus-cling - Jupyter kernel for the C++ programming language.
ROS IDEs - This page collects experience and advice on using integrated development environments (IDEs) with ROS.
TabNine - The all-language autocompleter.
kite - Use machine learning to give you useful code completions for Python.
jedi - Autocompletion and static analysis library for python.
roslibpy - Python ROS Bridge library allows to use Python and IronPython to interact with ROS, the open-source robotic middleware.
pybind11 - Seamless operability between C++11 and Python.
Sourcetrail - Free and open-source cross-platform source explorer.
rebound - Command-line tool that instantly fetches Stack Overflow results when an exception is thrown.
mybinder - Open notebooks in an executable environment, making your code immediately reproducible by anyone, anywhere.
ROSOnWindows - An experimental release of ROS1 for Windows.
live-share - Real-time collaborative development from the comfort of your favorite tools.
cocalc - Collaborative Calculation in the Cloud.
EasyClangComplete - Robust C/C++ code completion for Sublime Text 3.
vscode-ros - Visual Studio Code extension for Robot Operating System (ROS) development.
awesome-hpp - A curated list of awesome header-only C++ libraries.
Gitpod - An open source developer platform that automates the provisioning of ready-to-code development environments.
Template
ROS - Template for ROS node standardization in C++.
Launch - Templates on how to create launch files for larger projects.
Bash - A bash scripting template incorporating best practices & several useful functions.
URDF - Examples on how to create Unified Robot Description Format (URDF) for different kinds of robots.
Python - Style guide to be followed in writing Python code for ROS.
Docker - The Dockerfile in the minimal-ade project shows a minimal example of how to create a custom base image.
VS Code ROS2 Workspace Template - Template for using VSCode as an IDE for ROS2 development.
Build and Deploy
qemu-user-static - Enable an execution of different multi-architecture containers by QEMU and binfmt_misc.
Cross compile ROS 2 on QNX - Introduces how to cross compile ROS 2 on QNX.
bloom - A release automation tool which makes releasing catkin packages easier.
superflore - An extended platform release manager for Robot Operating System.
catkin_tools - Command line tools for working with catkin.
industrial_ci - Easy continuous integration repository for ROS repositories.
ros_gitlab_ci - Contains helper scripts and instructions on how to use Continuous Integration (CI) for ROS projects hosted on a GitLab instance.
gitlab-runner - Runs tests and sends the results to GitLab.
colcon-core - Command line tool to improve the workflow of building, testing and using multiple software packages.
gitlab-release - Simple python3 script to upload files (from ci) to the current projects release (tag).
clang - This is a compiler front-end for the C family of languages (C, C++, Objective-C, and Objective-C++) which is built as part of the LLVM compiler infrastructure project.
catkin_virtualenv - Bundle python requirements in a catkin package via virtualenv.
pyenv - Simple Python version management.
aptly - Debian repository management tool.
cross_compile - Assets used for ROS2 cross-compilation.
docker_images - Official Docker images maintained by OSRF on ROS(2) and Gazebo.
robot_upstart - Presents a suite of scripts to assist with launching background ROS processes on Ubuntu Linux PCs.
robot_systemd - Units for managing startup and shutdown of roscore and roslaunch.
ryo-iso - A modern ISO builder that streamlines the process of deploying a complete robot operating system from a yaml config file.
network_autoconfig - Automatic configuration of ROS networking for most use cases without impacting usage that require manual configuration.
rosbuild - The ROS build farm.
cros - A single thread pure C implementation of the ROS framework.
Unit and Integration Test
setup-ros - This action sets up a ROS and ROS 2 environment for use in GitHub actions.
UnitTesting - This page lays out the rationale, best practices, and policies for writing and running unit tests and integration tests for ROS.
googletest - Google's C++ test framework.
pytest - The pytest framework makes it easy to write small tests, yet scales to support complex functional testing.
doctest - The fastest feature-rich C++11/14/17/20 single-header testing framework for unit tests and TDD.
osrf_testing_tools_cpp - Contains testing tools for C++, and is used in OSRF projects.
code_coverage - ROS package to run coverage testing.
action-ros-ci - GitHub Action to build and test ROS 2 packages using colcon.
Lint and Format
action-ros-lint - GitHub action to run linters on ROS 2 packages.
cppcheck - Static analysis of C/C++ code.
hadolint - Dockerfile linter, validate inline bash, written in Haskell.
shellcheck - A static analysis tool for shell scripts.
catkin_lint - Checks package configurations for the catkin build system of ROS.
pylint - Pylint is a Python static code analysis tool which looks for programming errors, helps enforcing a coding standard, sniffs for code smells and offers simple refactoring suggestions.
black - The uncompromising Python code formatter.
pydocstyle - A static analysis tool for checking compliance with Python docstring conventions.
haros - Static analysis of ROS application code.
pydantic - Data parsing and validation using Python type hints.
Debugging and Tracing
heaptrack - Traces all memory allocations and annotates these events with stack traces.
ros2_tracing - Tracing tools for ROS 2.
Linuxperf - Various Linux performance material.
lptrace - It lets you see in real-time what functions a Python program is running.
pyre-check - Performant type-checking for python.
FlameGraph - Visualize profiled code.
gpuvis - GPU Trace Visualizer.
sanitizer - AddressSanitizer, ThreadSanitizer, MemorySanitizer.
cppinsights - C++ Insights - See your source code with the eyes of a compiler.
inspect - The inspect module provides functions for learning about live objects, including modules, classes, instances, functions, and methods.
Roslaunch Nodes in Valgrind or GDB - When debugging roscpp nodes that you are launching with roslaunch, you may wish to launch the node in a debugging program like gdb or valgrind instead.
pyperformance - Python Performance Benchmark Suite.
qira - QIRA is a competitor to strace and gdb.
gdb-frontend - GDBFrontend is an easy, flexible and extensionable gui debugger.
lttng - An open source software toolkit which you can use to simultaneously trace the Linux kernel, user applications, and user libraries.
ros2-performance - Allows to easily create arbitrary ROS2 systems and then measures their performance.
bcc - Tools for BPF-based Linux IO analysis, networking, monitoring, and more.
tracy - A real time, nanosecond resolution, remote telemetry frame profiler for games and other applications.
bpftrace - High-level tracing language for Linux eBPF.
pudb - Full-screen console debugger for Python.
backward-cpp - A beautiful stack trace pretty printer for C++.
gdb-dashboard - GDB dashboard is a standalone .gdbinit file written using the Python API that enables a modular interface showing relevant information about the program being debugged.
hotspot - The Linux perf GUI for performance analysis.
memory_profiler - A python module for monitoring memory consumption of a process as well as line-by-line analysis of memory consumption for python programs.
ros1_fuzzer - This fuzzer aims to help developers and researchers to find bugs and vulnerabilities in ROS nodes by performing fuzz tests over topics that the target nodes process.
vscode-debug-visualizer - An extension for VS Code that visualizes data during debugging.
action-tmate - Debug your GitHub Actions via SSH by using tmate to get access to the runner system itself.
libstatistics_collector - ROS 2 library providing classes to collect measurements and calculate statistics across them.
system_metrics_collector - Lightweight, real-time system metrics collector for ROS2 systems.
Version Control
git-fuzzy - A CLI interface to git that relies heavily on fzf.
meld - Meld is a visual diff and merge tool that helps you compare files, directories, and version controlled projects.
tig - Text-mode interface for git.
gitg - A graphical user interface for git.
git-cola - The highly caffeinated Git GUI.
python-gitlab - A Python package providing access to the GitLab server API.
bfg-repo-cleaner - Removes large or troublesome blobs like git-filter-branch does, but faster.
nbdime - Tools for diffing and merging of Jupyter notebooks.
semantic-release - Fully automated version management and package publishing.
go-semrel-gitab - Automate version management for Gitlab.
Git-repo - Git-Repo helps manage many Git repositories, does the uploads to revision control systems, and automates parts of the development workflow.
dive - A tool for exploring each layer in a docker image.
dvc - Management and versioning of datasets and machine learning models.
learnGitBranching - A git repository visualizer, sandbox, and a series of educational tutorials and challenges.
gitfs - You can mount a remote repository's branch locally, and any subsequent changes made to the files will be automatically committed to the remote.
git-secret - Encrypts files with permitted users' public keys, allowing users you trust to access encrypted data using pgp and their secret keys.
git-sweep - A command-line tool that helps you clean up Git branches that have been merged into master.
lazygit - A simple terminal UI for git commands, written in Go with the gocui library.
glab - An open-source GitLab command line tool.
Simulation
AI2-THOR - Python framework with a Unity backend providing interaction, navigation, and manipulation support for household based robotic agents, consisting of 200+ of custom scenes, 1500+ custom annotated objects, and 200+ actions.
Drake - Drake aims to simulate even very complex dynamics of robots.
Webots - Webots is an open source robot simulator compatible (among others) with ROS and ROS2.
lgsv - LG Electronics America R&D Center has developed an HDRP Unity-based multi-robot simulator for autonomous vehicle developers.
carla - Open-source simulator for autonomous driving research.
awesome-CARLA - A curated list of awesome CARLA tutorials, blogs, and related projects.
ros-bridge - ROS bridge for CARLA Simulator.
scenario_runner - Traffic scenario definition and execution engine.
deepdive - End-to-end simulation for self-driving cars.
uuv_simulator - Gazebo/ROS packages for underwater robotics simulation.
AirSim - Open source simulator for autonomous vehicles built on Unreal Engine.
self-driving-car-sim - A self-driving car simulator built with Unity.
ROSIntegration - Unreal Engine Plugin to enable ROS Support.
gym-gazebo - An OpenAI gym extension for using Gazebo known as gym-gazebo.
gym-pybullet-drones - PyBullet-based Gym environments for single and multi-agent reinforcement learning of quadcopter control.
safe-control-gym - PyBullet-based CartPole and Quadrotor environments—with CasADi symbolic dynamics and constraints—for safe and robust learning-based control.
highway-env - A collection of environments for autonomous driving and tactical decision-making tasks.
VREP Interface - ROS Bridge for the VREP simulator.
car_demo - This is a simulation of a Prius in gazebo 9 with sensor data being published using ROS kinetic.
sumo - Eclipse SUMO is an open source, highly portable, microscopic and continuous road traffic simulation package designed to handle large road networks.
open-simulation-interface - A generic interface for the environmental perception of automated driving functions in virtual scenarios.
ESIM - An Open Event Camera Simulator.
Menge - Crowd Simulation Framework.
pedsim_ros - Pedestrian simulator powered by the social force model for Gazebo.
opencrg - Open file formats and open source tools for the detailed description, creation and evaluation of road surfaces.
esmini - A basic OpenSCENARIO player.
OpenSceneGraph - An open source high performance 3D graphics toolkit, used by application developers in fields such as visual simulation, games, virtual reality, scientific visualization and modelling.
morse - An academic robotic simulator, based on the Blender Game Engine and the Bullet Physics engine.
ROSIntegrationVision - Support for ROS-enabled RGBD data acquisition in Unreal Engine Projects.
fetch_gazebo - Contains the Gazebo simulation for Fetch Robotics Fetch and Freight Research Edition Robots.
rotors_simulator - Provides some multirotor models.
flow - A computational framework for deep RL and control experiments for traffic microsimulation.
gnss-ins-sim - GNSS + inertial navigation, sensor fusion simulator. Motion trajectory generator, sensor models, and navigation.
Ignition Robotics - Test control strategies in safety, and take advantage of simulation in continuous integration tests.
simulation assets for the SubT - This collection contains simulation assets for the SubT Challenge Virtual Competition in Gazebo.
gazebo_ros_motors - Contains currently two motor plugins for Gazebo, one with an ideal speed controller and one without a controller that models a DC motor.
map2gazebo - ROS package for creating Gazebo environments from 2D maps.
sim_vehicle_dynamics - Vehicle Dynamics Simulation Software of TUM Roborace Team.
gym-carla - An OpenAI gym wrapper for CARLA simulator.
simbody - High-performance C++ multibody dynamics/physics library for simulating articulated biomechanical and mechanical systems like vehicles, robots, and the human skeleton.
gazebo_models - This repository holds the Gazebo model database.
pylot - Autonomous driving platform running on the CARLA simulator.
flightmare - Flightmare is composed of two main components: a configurable rendering engine built on Unity and a flexible physics engine for dynamics simulation.
champ - ROS Packages for CHAMP Quadruped Controller.
rex-gym - OpenAI Gym environments for an open-source quadruped robot (SpotMicro).
Trick - Developed at the NASA Johnson Space Center, is a powerful simulation development framework that enables users to build applications for all phases of space vehicle development.
usv_sim_lsa - Unmanned Surface Vehicle simulation on Gazebo with water current and winds.
42 - Simulation for spacecraft attitude control system analysis and design.
Complete_Street_Rule - A scenario oriented design tool intended to enable users to quickly create procedurally generated multimodal streets in ArcGIS CityEngine.
AutoCore simulation - Provides test environment for Autoware and still during early development, contents below may changed during updates.
fields-ignition - Generate random crop fields for Ignition Gazebo.
Unity-Robotics-Hub - Central repository for tools, tutorials, resources, and documentation for robotic simulation in Unity.
BlueSky - The goal of BlueSky is to provide everybody who wants to visualize, analyze or simulate air traffic with a tool to do so without any restrictions, licenses or limitations.
Cloe - Empowers developers of automated-driving software components by providing a unified interface to closed-loop simulation.
Dynamic_logistics_Warehouse - Gazebo simulation of dynamics environment in warehouses.
OpenCDA - A generalized framework for prototyping full-stack cooperative driving automation applications under CARLA+SUMO.
Electronics and Mechanics
HRIM - An information model for robot hardware.
URDF - Repository for Unified Robot Description Format (URDF) parsing code.
phobos - An add-on for Blender allowing to create URDF, SDF and SMURF robot models in a WYSIWYG environment.
urdf-viz - Visualize URDF/XACRO file, URDF Viewer works on Windows/macOS/Linux.
solidworks_urdf_exporter - SolidWorks to URDF Exporter.
FreeCAD - Your own 3D parametric modeler.
kicad - A Cross Platform and Open Source Electronics Design Automation Suite.
PcbDraw - Convert your KiCAD board into a nice looking 2D drawing suitable for pinout diagrams.
kicad-3rd-party-tools - Tools made by others to augment the KiCad PCB EDA suite.
PandaPower - An easy to use open source tool for power system modeling, analysis and optimization with a high degree of automation.
LibrePCB - A powerful, innovative and intuitive EDA tool for everyone.
openscad - A software for creating solid 3D CAD models.
ngspice - A open source spice simulator for electric and electronic circuits.
GNSS-SDR - GNSS-SDR provides interfaces for a wide range of radio frequency front-ends and raw sample file formats, generates processing outputs in standard formats.
riscv - The Free and Open RISC Instruction Set Architecture.
urdfpy - A simple and easy-to-use library for loading, manipulating, saving, and visualizing URDF files.
FMPy - Simulate Functional Mockup Units (FMUs) in Python.
FMIKit-Simulink - Import and export Functional Mock-up Units with Simulink.
oemof-solph - A modular open source framework to model energy supply systems.
NASA-3D-Resources - Here you'll find a growing collection of 3D models, textures, and images from inside NASA.
SUAVE - An Aircraft Design Toolbox.
opem - The Open-Source PEMFC Simulation Tool (OPEM) is a modeling tool for evaluating the performance of proton exchange membrane fuel cells.
pvlib-python - A community supported tool that provides a set of functions and classes for simulating the performance of photovoltaic energy systems.
WireViz - A tool for easily documenting cables, wiring harnesses and connector pinouts.
Horizon - EDA is an Electronic Design Automation package supporting an integrated end-to-end workflow for printed circuit board design including parts management and schematic entry.
tigl - The TiGL Geometry Library can be used for the computation and processing of aircraft geometries stored inside CPACS files.
foxBMS - A free, open and flexible development environment to design battery management systems.
cadCAD - A Python package that assists in the processes of designing, testing and validating complex systems through simulation, with support for Monte Carlo methods, A/B testing and parameter sweeping.
OpenMDAO - An open-source framework for efficient multidisciplinary optimization.
ODrive - The aim is to make it possible to use inexpensive brushless motors in high performance robotics projects.
OpenTirePython - An open-source mathematical tire modelling library.
Inkscape Ray Optics - An extension for Inkscape that makes it easier to draw optical diagrams.
OpenAeroStruct - A lightweight tool that performs aerostructural optimization using OpenMDAO.
Sensor Processing
Calibration and Transformation
tf2 - Transform library, which lets the user keep track of multiple coordinate frames over time.
TriP - A Inverse Kinematics library for serial robots, parallel robots and hybrids of both.
lidar_align - A simple method for finding the extrinsic calibration between a 3D lidar and a 6-dof pose sensor.
kalibr - The Kalibr visual-inertial calibration toolbox.
Calibnet - Self-Supervised Extrinsic Calibration using 3D Spatial Transformer Networks.
lidar_camera_calibration - ROS package to find a rigid-body transformation between a LiDAR and a camera.
ILCC - Reflectance Intensity Assisted Automatic and Accurate Extrinsic Calibration of 3D LiDAR.
easy_handeye - Simple, straighforward ROS library for hand-eye calibration.
imu_utils - A ROS package tool to analyze the IMU performance.
kalibr_allan - IMU Allan standard deviation charts for use with Kalibr and inertial kalman filters.
pyquaternion - A full-featured Python module for representing and using quaternions.
robot_calibration - This package offers calibration of a number of parameters of a robot, such as: 3D Camera intrinsics, extrinsics Joint angle offsets and robot frame offsets.
multi_sensor_calibration - Contains a calibration tool to calibrate a sensor setup consisting of lidars, radars and cameras.
LiDARTag - A Real-Time Fiducial Tag using Point Clouds Lidar Data.
multicam_calibration - Extrinsic and intrinsic calbration of cameras.
ikpy - An Inverse Kinematics library aiming performance and modularity.
livox_camera_lidar_calibration - Calibrate the extrinsic parameters between Livox LiDAR and camera.
lidar_camera_calibration - Camera LiDAR Calibration using ROS, OpenCV, and PCL.
e2calib - Contains code that implements video reconstruction from event data for calibration.
Perception Pipeline
SARosPerceptionKitti - ROS package for the Perception (Sensor Processing, Detection, Tracking and Evaluation) of the KITTI Vision Benchmark Suite.
multiple-object-tracking-lidar - C++ implementation to Detect, track and classify multiple objects using LIDAR scans or point cloud.
cadrl_ros - ROS package for dynamic obstacle avoidance for ground robots trained with deep RL.
AugmentedAutoencoder - RGB-based pipeline for object detection and 6D pose estimation.
jsk_recognition - A stack for the perception packages which are used in JSK lab.
GibsonEnv - Gibson Environments: Real-World Perception for Embodied Agents.
morefusion - Multi-object Reasoning for 6D Pose Estimation from Volumetric Fusion.
se(3)-TrackNet - A package for 6D pose tracking of dynamic objects when object's CAD model is available.
Machine Learning
DLIB - A toolkit for making real world machine learning and data analysis applications in C++.
fastai - The fastai library simplifies training fast and accurate neural nets using modern best practices.
tpot - A Python Automated Machine Learning tool that optimizes machine learning pipelines using genetic programming.
deap - Distributed Evolutionary Algorithms in Python.
gym - A toolkit for developing and comparing reinforcement learning algorithms.
tensorflow_ros_cpp - A ROS package that allows to do Tensorflow inference in C++ without the need to compile TF yourself.
Tensorflow Federated - TensorFlow Federated (TFF) is an open-source framework for machine learning and other computations on decentralized data.
finn - Fast, Scalable Quantized Neural Network Inference on FPGAs.
neuropod - Neuropod is a library that provides a uniform interface to run deep learning models from multiple frameworks in C++ and Python.
leela-zero - This is a fairly faithful reimplementation of the system described in the Alpha Go Zero paper "Mastering the Game of Go without Human Knowledge".
Trax - A library for deep learning that focuses on sequence models and reinforcement learning.
mlflow - A platform to streamline machine learning development, including tracking experiments, packaging code into reproducible runs, and sharing and deploying models.
Netron - Visualizer for neural network, deep learning and machine learning models.
MNN - A blazing fast, lightweight deep learning framework, battle-tested by business-critical use cases in Alibaba.
Tensorforce - An open-source deep reinforcement learning framework, with an emphasis on modularized flexible library design and straightforward usability for applications in research and practice.
Dopamine - A research framework for fast prototyping of reinforcement learning algorithms.
catalyst - Was developed with a focus on reproducibility, fast experimentation and code/ideas reusing.
ray - A fast and simple framework for building and running distributed applications.
tf-agents - A reliable, scalable and easy to use TensorFlow library for Contextual Bandits and Reinforcement Learning.
ReAgent - An open source end-to-end platform for applied reinforcement learning (RL) developed and used at Facebook.
Awesome-Mobile-Machine-Learning - A curated list of awesome mobile machine learning resources for iOS, Android, and edge devices.
cnn-explainer - Learning Convolutional Neural Networks with Interactive Visualization.
modelzoo - A collection of machine-learned models for use in autonomous driving applications.
nnstreamer-ros - A set of Gstreamer plugins and ROS examples that allow Gstreamer developers to adopt neural network models easily and efficiently and neural network developers to manage neural network pipelines and their filters easily and efficiently.
Parallel Processing
dask - Parallel computing with task scheduling for Python.
cupy - NumPy-like API accelerated with CUDA.
Thrust - A C++ parallel programming library which resembles the C++ Standard Library.
ArrayFire - A general purpose GPU library.
OpenMP - An application programming interface that supports multi-platform shared memory multiprocessing programming in C, C++, and Fortran.
VexCL - VexCL is a C++ vector expression template library for OpenCL/CUDA/OpenMP.
PYNQ - An open-source project from Xilinx that makes it easy to design embedded systems with Zynq All Programmable Systems on Chips.
numba - NumPy aware dynamic Python compiler using LLVM.
TensorRT - A C++ library for high performance inference on NVIDIA GPUs and deep learning accelerators.
libcudacxx - Provides a heterogeneous implementation of the C++ Standard Library that can be used in and between CPU and GPU code.
Image Processing
CV-pretrained-model - A collection of computer vision pre-trained models.
image_pipeline - Fills the gap between getting raw images from a camera driver and higher-level vision processing.
gstreamer - A pipeline-based multimedia framework that links together a wide variety of media processing systems to complete complex workflows.
ros2_openvino_toolkit - Provides a ROS-adaptered runtime framework of neural network which quickly deploys applications and solutions for vision inference.
vision_visp - Wraps the ViSP moving edge tracker provided by the ViSP visual servoing library into a ROS package.
apriltag_ros - A ROS wrapper of the AprilTag 3 visual fiducial detector.
deep_object_pose - Deep Object Pose Estimation.
DetectAndTrack - Detect-and-Track: Efficient Pose.
SfMLearner - An unsupervised learning framework for depth and ego-motion estimation.
imgaug - Image augmentation for machine learning experiments.
vision_opencv - Packages for interfacing ROS with OpenCV, a library of programming functions for real time computer vision.
darknet_ros - YOLO ROS: Real-Time Object Detection for ROS.
ros_ncnn - YOLACT / YOLO ( among other things ) on NCNN inference engine for ROS.
tf-pose-estimation - Deep Pose Estimation implemented using Tensorflow with Custom Architectures for fast inference.
find-object - Simple Qt interface to try OpenCV implementations of SIFT, SURF, FAST, BRIEF and other feature detectors and descriptors.
yolact - A simple, fully convolutional model for real-time instance segmentation.
Kimera-Semantics - Real-Time 3D Semantic Reconstruction from 2D data.
detectron2 - A next-generation research platform for object detection and segmentation.
OpenVX - Enables performance and power-optimized computer vision processing, especially important in embedded and real-time use cases.
3d-vehicle-tracking - Official implementation of Joint Monocular 3D Vehicle Detection and Tracking.
pysot - The goal of PySOT is to provide a high-quality, high-performance codebase for visual tracking research.
semantic_slam - Real time semantic slam in ROS with a hand held RGB-D camera.
kitti_scan_unfolding - We propose KITTI scan unfolding in our paper Scan-based Semantic Segmentation of LiDAR Point Clouds: An Experimental Study.
packnet-sfm - Official PyTorch implementation of self-supervised monocular depth estimation methods invented by the ML Team at Toyota Research Institute (TRI).
AB3DMOT - This work proposes a simple yet accurate real-time baseline 3D multi-object tracking system.
monoloco - Official implementation of "MonoLoco: Monocular 3D Pedestrian Localization and Uncertainty Estimation" in PyTorch.
Poly-YOLO - Builds on the original ideas of YOLOv3 and removes two of its weaknesses: a large amount of rewritten labels and inefficient distribution of anchors.
satellite-image-deep-learning - Resources for deep learning with satellite & aerial imagery.
robosat - Semantic segmentation on aerial and satellite imagery.
big_transfer - Model for General Visual Representation Learning created by Google Research.
LEDNet - A Lightweight Encoder-Decoder Network for Real-time Semantic Segmentation.
TorchSeg - This project aims at providing a fast, modular reference implementation for semantic segmentation models using PyTorch.
simpledet - A Simple and Versatile Framework for Object Detection and Instance Recognition.
meshroom - Meshroom is a free, open-source 3D Reconstruction Software based on the AliceVision Photogrammetric Computer Vision framework.
EasyOCR - Ready-to-use Optical character recognition (OCR) with 40+ languages supported including Chinese, Japanese, Korean and Thai.
pytracking - A general python framework for visual object tracking and video object segmentation, based on PyTorch.
ros_deep_learning - Deep learning inference nodes for ROS with support for NVIDIA Jetson TX1/TX2/Xavier and TensorRT.
hyperpose - HyperPose: A Flexible Library for Real-time Human Pose Estimation.
fawkes - Privacy preserving tool against facial recognition systems.
anonymizer - An anonymizer to obfuscate faces and license plates.
opendatacam - Only saves surveyed meta-data, in particular the path an object moved or number of counted objects at a certain point.
Cam2BEV - TensorFlow Implementation for Computing a Semantically Segmented Bird's Eye View (BEV) Image Given the Images of Multiple Vehicle-Mounted Cameras.
flownet2-pytorch - Pytorch implementation of FlowNet 2.0: Evolution of Optical Flow Estimation with Deep Networks.
Simd - C++ image processing and machine learning library with using of SIMD: SSE, SSE2, SSE3, SSSE3, SSE4.1, SSE4.2, AVX, AVX2, AVX-512, VMX(Altivec) and VSX(Power7), NEON for ARM.
AliceVision - A Photogrammetric Computer Vision Framework which provides a 3D Reconstruction and Camera Tracking algorithms.
satpy - A python library for reading and manipulating meteorological remote sensing data and writing it to various image and data file formats.
eo-learn - A collection of open source Python packages that have been developed to seamlessly access and process spatio-temporal image sequences acquired by any satellite fleet in a timely and automatic manner.
libvips - A fast image processing library with low memory needs.
Radar Processing
pyroSAR - Framework for large-scale SAR satellite data processing.
CameraRadarFusionNet - TUM Roborace Team Software Stack - Path tracking control, velocity control, curvature control and state estimation.
Lidar and Point Cloud Processing
cilantro - A lean C++ library for working with point cloud data.
open3d - Open3D: A Modern Library for 3D Data Processing.
SqueezeSeg - Implementation of SqueezeSeg, convolutional neural networks for LiDAR point clout segmentation.
point_cloud_io - ROS nodes to read and write point clouds from and to files (e.g. ply, vtk).
python-pcl - Python bindings to the pointcloud library.
libpointmatcher - An "Iterative Closest Point" library for 2-D/3-D mapping in Robotics.
depth_clustering - Fast and robust clustering of point clouds generated with a Velodyne sensor.
lidar-bonnetal - Semantic and Instance Segmentation of LiDAR point clouds for autonomous driving.
CSF - LiDAR point cloud ground filtering / segmentation (bare earth extraction) method based on cloth simulation.
robot_body_filter - A highly configurable LaserScan/PointCloud2 filter that allows to dynamically remove the 3D body of the robot from the measurements.
grid_map - Universal grid map library for mobile robotic mapping.
elevation_mapping - Robot-centric elevation mapping for rough terrain navigation.
rangenet_lib - Contains simple usage explanations of how the RangeNet++ inference works with the TensorRT and C++ interface.
pointcloud_to_laserscan - Converts a 3D Point Cloud into a 2D laser scan.
octomap - An Efficient Probabilistic 3D Mapping Framework Based on Octrees.
pptk - Point Processing Toolkit from HEREMaps.
gpu-voxels - GPU-Voxels is a CUDA based library which allows high resolution volumetric collision detection between animated 3D models and live pointclouds from 3D sensors of all kinds.
spatio_temporal_voxel_layer - A new voxel layer leveraging modern 3D graphics tools to modernize navigation environmental representations.
LAStools - Award-winning software for efficient LiDAR processing.
PCDet - A general PyTorch-based codebase for 3D object detection from point cloud.
PDAL - A C++ BSD library for translating and manipulating point cloud data.
PotreeConverter - Builds a potree octree from las, laz, binary ply, xyz or ptx files.
fast_gicp - A collection of GICP-based fast point cloud registration algorithms.
ndt_omp - Multi-threaded and SSE friendly NDT algorithm.
laser_line_extraction - A ROS packages that extracts line segments from LaserScan messages.
Go-ICP - Implementation of the Go-ICP algorithm for globally optimal 3D pointset registration.
PointCNN - A simple and general framework for feature learning from point clouds.
segmenters_lib - The LiDAR segmenters library, for segmentation-based detection.
MotionNet - Joint Perception and Motion Prediction for Autonomous Driving Based on Bird's Eye View Maps.
PolarSeg - An Improved Grid Representation for Online LiDAR Point Clouds Semantic Segmentation.
traversability_mapping - Takes in point cloud from a Velodyne VLP-16 Lidar and outputs a traversability map for autonomous navigation in real-time.
lidar_super_resolution - Simulation-based Lidar Super-resolution for Ground Vehicles.
Cupoch - A library that implements rapid 3D data processing and robotics computation using CUDA.
linefit_ground_segmentation - Implementation of the ground segmentation algorithm.
Draco - A library for compressing and decompressing 3D geometric meshes and point clouds.
Votenet - Deep Hough Voting for 3D Object Detection in Point Clouds.
lidar_undistortion - Provides lidar motion undistortion based on an external 6DoF pose estimation input.
superpoint_graph - Large-scale Point Cloud Semantic Segmentation with Superpoint Graphs.
RandLA-Net - Efficient Semantic Segmentation of Large-Scale Point Clouds.
Det3D - A first 3D Object Detection toolbox which provides off the box implementations of many 3D object detection algorithms such as PointPillars, SECOND, PIXOR.
OverlapNet - A modified Siamese Network that predicts the overlap and relative yaw angle of a pair of range images generated by 3D LiDAR scans.
mp2p_icp - A repertory of multi primitive-to-primitive (MP2P) ICP algorithms in C++.
OpenPCDet - A Toolbox for LiDAR-based 3D Object Detection.
torch-points3d - Pytorch framework for doing deep learning on point clouds.
PolyFit - Polygonal Surface Reconstruction from Point Clouds.
mmdetection3d - Next-generation platform for general 3D object detection.
gpd - Takes a point cloud as input and produces pose estimates of viable grasps as output.
SalsaNext - Uncertainty-aware Semantic Segmentation of LiDAR Point Clouds for Autonomous Driving.
Super-Fast-Accurate-3D-Object-Detection - Super Fast and Accurate 3D Object Detection based on 3D LiDAR Point Clouds (The PyTorch implementation).
kaolin - A PyTorch Library for Accelerating 3D Deep Learning Research.
CamVox - A low-cost SLAM system based on camera and Livox lidar.
SA-SSD - Structure Aware Single-stage 3D Object Detection from Point Cloud.
cuda-pcl - Accelerating Lidar for Robotics with NVIDIA CUDA-based PCL.
urban_road_filter - Real-time LIDAR-based Urban Road and Sidewalk detection for Autonomous Vehicles.
Removert - Remove then revert. Static map construction in the wild and dynamic points removing tool by constructing a static map.
KISS-ICP - A LiDAR Odometry pipeline that just works on most of the cases without tunning any parameter.
Localization and State Estimation
evo - Python package for the evaluation of odometry and SLAM.
robot_localization - A package of nonlinear state estimation nodes.
fuse - General architecture for performing sensor fusion live on a robot.
GeographicLib - A C++ library for geographic projections.
ntripbrowser - A Python API for browsing NTRIP (Networked Transport of RTCM via Internet Protocol).
imu_tools - IMU-related filters and visualizers.
RTKLIB - A version of RTKLIB optimized for single and dual frequency low cost GPS receivers, especially u-blox receivers.
gLAB - Performs precise modeling of GNSS observables (pseudorange and carrier phase) at the centimetre level, allowing standalone GPS positioning, PPP, SBAS and DGNSS.
ai-imu-dr - Contains the code of our novel accurate method for dead reckoning of wheeled vehicles based only on an IMU.
Kalman-and-Bayesian-Filters-in-Python - Kalman Filter book using Jupyter Notebook.
mcl_3dl - A ROS node to perform a probabilistic 3-D/6-DOF localization system for mobile robots with 3-D LIDAR(s).
se2lam - On-SE(2) Localization and Mapping for Ground Vehicles by Fusing Odometry and Vision.
mmWave-localization-learning - ML-based positioning method from mmWave transmissions - with high accuracy and energy efficiency.
dynamic_robot_localization - A ROS package that offers 3 DoF and 6 DoF localization using PCL and allows dynamic map update using OctoMap.
eagleye - An open-source software for vehicle localization utilizing GNSS and IMU.
python-sgp4 - Python version of the SGP4 satellite position library.
PROJ - Cartographic Projections and Coordinate Transformations Library.
rpg_trajectory_evaluation - Implements common used trajectory evaluation methods for visual(-inertial) odometry.
pymap3d - Pure-Python (Numpy optional) 3D coordinate conversions for geospace ecef enu eci.
libRSF - A robust sensor fusion library for online localization.
Simultaneous Localization and Mapping
Lidar
KISS-ICP - A LiDAR Odometry pipeline that just works on most of the cases without tunning any parameter.
loam_velodyne - Laser Odometry and Mapping (Loam) is a realtime method for state estimation and mapping using a 3D lidar.
lio-mapping - Implementation of Tightly Coupled 3D Lidar Inertial Odometry and Mapping (LIO-mapping).
A-LOAM - Advanced implementation of LOAM.
Fast LOAM - Fast and Optimized Lidar Odometry And Mapping.
LIO_SAM - Tightly-coupled Lidar Inertial Odometry via Smoothing and Mapping.
cartographer_ros - Provides ROS integration for Cartographer.
loam_livox - A robust LiDAR Odometry and Mapping (LOAM) package for Livox-LiDAR.
StaticMapping - Use LiDAR to map the static world.
semantic_suma - Semantic Mapping using Surfel Mapping and Semantic Segmentation.
slam_toolbox - Slam Toolbox for lifelong mapping and localization in potentially massive maps with ROS .
maplab - An open visual-inertial mapping framework.
hdl_graph_slam - An open source ROS package for real-time 6DOF SLAM using a 3D LIDAR.
interactive_slam - In contrast to existing automatic SLAM packages, we with minimal human effort.
LeGO-LOAM - Lightweight and Ground-Optimized Lidar Odometry and Mapping on Variable Terrain.
pyslam - Contains a monocular Visual Odometry (VO) pipeline in Python.
Kitware SLAM - LiDAR-only visual SLAM developped by Kitware, as well as ROS and ParaView wrappings for easier use.
horizon_highway_slam - A robust, low drift, and real time highway SLAM package suitable for Livox Horizon lidar.
mola - A Modular System for Localization and Mapping.
DH3D - Deep Hierarchical 3D Descriptors for Robust Large-Scale 6DOF Relocalization.
LaMa - LaMa is a C++11 software library for robotic localization and mapping.
Scan Context - Global LiDAR descriptor for place recognition and long-term localization.
M-LOAM - Robust Odometry and Mapping for Multi-LiDAR Systems with Online Extrinsic Calibration.
Visual
orb_slam_2_ros - A ROS implementation of ORB_SLAM2.
orbslam-map-saving-extension - In this extensions the map of ORB-features be saved to the disk as a reference for future runs along the same track.
dso - Direct Sparse Odometry.
viso2 - A ROS wrapper for libviso2, a library for visual odometry.
xivo - X Inertial-aided Visual Odometry.
rovio - Robust Visual Inertial Odometry Framework.
LSD-SLAM - Large-Scale Direct Monocular SLAM is a real-time monocular SLAM.
CubeSLAM and ORB SLAM - Monocular 3D Object Detection and SLAM Package of CubeSLAM and ORB SLAM.
VINS-Fusion - A Robust and Versatile Multi-Sensor Visual-Inertial State Estimator.
openvslam - OpenVSLAM: A Versatile Visual SLAM Framework.
basalt - Visual-Inertial Mapping with Non-Linear Factor Recovery.
Kimera - A C++ library for real-time metric-semantic simultaneous localization and mapping, which uses camera images and inertial data to build a semantically annotated 3D mesh of the environment.
tagslam - A ROS-based package for Simultaneous Localization and Mapping using AprilTag fiducial markers.
LARVIO - A lightweight, accurate and robust monocular visual inertial odometry based on Multi-State Constraint Kalman Filter.
fiducials - Simultaneous localization and mapping using fiducial markers.
open_vins - An open source platform for visual-inertial navigation research.
ORB_SLAM3 - ORB-SLAM3: An Accurate Open-Source Library for Visual, Visual-Inertial and Multi-Map SLAM.
Atlas - End-to-End 3D Scene Reconstruction from Posed Images.
vilib - This library focuses on the front-end of VIO pipelines with CUDA.
hloc - A modular toolbox for state-of-the-art 6-DoF visual localization. It implements Hierarchical Localization, leveraging image retrieval and feature matching, and is fast, accurate, and scalable.
ESVO - A novel pipeline for real-time visual odometry using a stereo event-based camera.
gradslam - An open source differentiable dense SLAM library for PyTorch.
Vector Map
OpenDRIVE - An open file format for the logical description of road networks.
MapsModelsImporter - A Blender add-on to import models from google maps.
Lanelet2 - Map handling framework for automated driving.
barefoot - Online and Offline map matching that can be used stand-alone and in the cloud.
iD - The easy-to-use OpenStreetMap editor in JavaScript.
RapiD - An enhanced version of iD for mapping with AI created by Facebook.
segmap - A map representation based on 3D segments.
Mapbox - A JavaScript library for interactive, customizable vector maps on the web.
osrm-backend - Open Source Routing Machine - C++ backend.
assuremapingtools - Desktop based tool for viewing, editing and saving road network maps for autonomous vehicle platforms such as Autoware.
geopandas - A project to add support for geographic data to pandas objects.
MapToolbox - Plugins to make Autoware vector maps in Unity.
imagery-index - An index of aerial and satellite imagery useful for mapping.
mapillary_tools - A library for processing and uploading images to Mapillary.
mapnik - Combines pixel-perfect image output with lightning-fast cartographic algorithms, and exposes interfaces in C++, Python, and Node.
gdal - GDAL is an open source X/MIT licensed translator library for raster and vector geospatial data formats.
grass - GRASS GIS - free and open source Geographic Information System (GIS).
3d-tiles - Specification for streaming massive heterogeneous 3D geospatial datasets.
osmnx - Python for street networks. Retrieve, model, analyze, and visualize street networks and other spatial data from OpenStreetMap.
Prediction
Awesome-Interaction-aware-Trajectory-Prediction - A selection of state-of-the-art research materials on trajectory prediction.
sgan - Socially Acceptable Trajectories with Generative Adversarial Networks.
Behavior and Decision
Groot - Graphical Editor to create BehaviorTrees. Compliant with BehaviorTree.CPP.
BehaviorTree.CPP - Behavior Trees Library in C++.
RAFCON - Uses hierarchical state machines, featuring concurrent state execution, to represent robot programs.
ROSPlan - Generic framework for task planning in a ROS system.
ad-rss-lib - Library implementing the Responsibility Sensitive Safety model (RSS) for Autonomous Vehicles.
FlexBE - Graphical editor for hierarchical state machines, based on ROS's smach.
sts_bt_library - This library provides the functionality to set up your own behavior tree logic by using the defined tree structures like Fallback, Sequence or Parallel Nodes.
SMACC - An Event-Driven, Asynchronous, Behavioral State Machine Library for real-time ROS (Robotic Operating System) applications written in C++ .
py_trees_ros - Behaviours, trees and utilities that extend py_trees for use with ROS.
Planning and Control
pacmod - Designed to allow the user to control a vehicle with the PACMod drive-by-wire system.
mpcc - Model Predictive Contouring Controller for Autonomous Racing.
rrt - C++ RRT (Rapidly-exploring Random Tree) implementation.
HypridAStarTrailer - A path planning algorithm based on Hybrid A* for trailer truck.
path_planner - Hybrid A* Path Planner for the KTH Research Concept Vehicle.
open_street_map - ROS packages for working with Open Street Map geographic information.
Open Source Car Control - An assemblage of software and hardware designs that enable computer control of modern cars in order to facilitate the development of autonomous vehicle technology.
fastrack - A ROS implementation of Fast and Safe Tracking (FaSTrack).
commonroad - Composable benchmarks for motion planning on roads.
traffic-editor - A graphical editor for robot traffic flows.
steering_functions - Contains a C++ library that implements steering functions for car-like robots with limited turning radius.
moveit - Easy-to-use robotics manipulation platform for developing applications, evaluating designs, and building integrated products.
flexible-collision-library - A library for performing three types of proximity queries on a pair of geometric models composed of triangles.
aikido - Artificial Intelligence for Kinematics, Dynamics, and Optimization.
casADi - A symbolic framework for numeric optimization implementing automatic differentiation in forward and reverse modes on sparse matrix-valued computational graphs.
ACADO Toolkit - A software environment and algorithm collection for automatic control and dynamic optimization.
control-toolbox - An efficient C++ library for control, estimation, optimization and motion planning in robotics.
CrowdNav - Crowd-aware Robot Navigation with Attention-based Deep Reinforcement Learning.
ompl - Consists of many state-of-the-art sampling-based motion planning algorithms.
openrave - Open Robotics Automation Virtual Environment: An environment for testing, developing, and deploying robotics motion planning algorithms.
teb_local_planner - An optimal trajectory planner considering distinctive topologies for mobile robots based on Timed-Elastic-Bands.
pinocchio - A fast and flexible implementation of Rigid Body Dynamics algorithms and their analytical derivatives.
rmf_core - The rmf_core packages provide the centralized functions of the Robotics Middleware Framework (RMF).
OpEn - A solver for Fast & Accurate Embedded Optimization for next-generation Robotics and Autonomous Systems.
autogenu-jupyter - This project provides the continuation/GMRES method (C/GMRES method) based solvers for nonlinear model predictive control (NMPC) and an automatic code generator for NMPC.
global_racetrajectory_optimization - This repository contains multiple approaches for generating global racetrajectories.
toppra - A library for computing the time-optimal path parametrization for robots subject to kinematic and dynamic constraints.
tinyspline - TinySpline is a small, yet powerful library for interpolating, transforming, and querying arbitrary NURBS, B-Splines, and Bézier curves.
dual quaternions ros - ROS python package for dual quaternion SLERP.
mb planner - Aerial vehicle planner for tight spaces. Used in DARPA SubT Challenge.
ilqr - Iterative Linear Quadratic Regulator with auto-differentiatiable dynamics models.
EGO-Planner - A lightweight gradient-based local planner without ESDF construction, which significantly reduces computation time compared to some state-of-the-art methods.
pykep - A scientific library providing basic tools for research in interplanetary trajectory design.
am_traj - Alternating Minimization Based Trajectory Generation for Quadrotor Aggressive Flight.
GraphBasedLocalTrajectoryPlanner - Was used on a real race vehicle during the Roborace Season Alpha and achieved speeds above 200km/h.
se2_navigation - Pure pursuit controller and Reeds-Shepp sampling based planner for navigation in SE(2) space.
Ruckig - Instantaneous Motion Generation. Real-time. Jerk-constrained. Time-optimal.
User Interaction
Graphical User Interface
imgui - Designed to enable fast iterations and to empower programmers to create content creation tools and visualization / debug tools.
qtpy - Provides an uniform layer to support PyQt5, PySide2, PyQt4 and PySide with a single codebase.
mir - Mir is set of libraries for building Wayland based shells.
rqt - A Qt-based framework for GUI development for ROS. It consists of three parts/metapackages.
cage - This is Cage, a Wayland kiosk. A kiosk runs a single, maximized application.
chilipie - Easy-to-use Raspberry Pi image for booting directly into full-screen Chrome.
pencil - A tool for making diagrams and GUI prototyping that everyone can use.
dynamic_reconfigure - The focus of dynamic_reconfigure is on providing a standard way to expose a subset of a node's parameters to external reconfiguration.
ddynamic_reconfigure - Allows modifying parameters of a ROS node using the dynamic_reconfigure framework without having to write cfg files.
elements - A lightweight, fine-grained, resolution independent, modular GUI library.
NanoGUI - A minimalistic cross-platform widget library for OpenGL 3.x or higher.
Acoustic User Interface
pyo - A Python module written in C containing classes for a wide variety of audio signal processing types.
rhasspy - Rhasspy (pronounced RAH-SPEE) is an offline, multilingual voice assistant toolkit inspired by Jasper that works well with Home Assistant, Hass.io, and Node-RED.
mycroft-core - Mycroft is a hackable open source voice assistant.
DDSP - A library of differentiable versions of common DSP functions (such as synthesizers, waveshapers, and filters).
NoiseTorch - Creates a virtual microphone that suppresses noise, in any application.
DeepSpeech - An open source Speech-To-Text engine, using a model trained by machine learning techniques based on Baidu's Deep Speech research paper.
waveglow - A Flow-based Generative Network for Speech Synthesis.
TTS - A deep learning toolkit for Text-to-Speech, battle-tested in research and production.
Command Line Interface
the-art-of-command-line - Master the command line, in one page.
dotfiles of cornerman - Powerful zsh and vim dotfiles.
dotbot - A tool that bootstraps your dotfiles.
prompt-hjem - A beautiful zsh prompt.
ag - A code-searching tool similar to ack, but faster.
fzf - A command-line fuzzy finder.
pkgtop - Interactive package manager and resource monitor designed for the GNU/Linux.
asciimatics - A cross platform package to do curses-like operations, plus higher level APIs and widgets to create text UIs and ASCII art animations.
gocui - Minimalist Go package aimed at creating Console User Interfaces.
TerminalImageViewer - Small C++ program to display images in a (modern) terminal using RGB ANSI codes and unicode block graphics characters.
rosshow - Visualize ROS topics inside a terminal with Unicode/ASCII art.
python-prompt-toolkit - Library for building powerful interactive command line applications in Python.
guake - Drop-down terminal for GNOME.
wemux - Multi-User Tmux Made Easy.
tmuxp - A session manager built on libtmux.
mapscii - World map renderer for your console.
terminator - The goal of this project is to produce a useful tool for arranging terminals.
bat - A cat(1) clone with wings.
fx - Command-line tool and terminal JSON viewer.
tmate - Instant terminal sharing.
Data Visualization and Mission Control
xdot - Interactive viewer for graphs written in Graphviz's dot language.
guacamole - Clientless remote desktop gateway. It supports standard protocols like VNC, RDP, and SSH.
ros3djs - 3D Visualization Library for use with the ROS JavaScript Libraries.
webviz - Web-based visualization libraries like rviz.
plotly.py - An open-source, interactive graphing library for Python.
PlotJuggler - The timeseries visualization tool that you deserve.
bokeh - Interactive Data Visualization in the browser, from Python.
voila - From Jupyter notebooks to standalone web applications and dashboards.
Pangolin - Pangolin is a lightweight portable rapid development library for managing OpenGL display / interaction and abstracting video input.
rqt_bag - Provides a GUI plugin for displaying and replaying ROS bag files.
kepler.gl - Kepler.gl is a powerful open source geospatial analysis tool for large-scale data sets.
qgis_ros - Access bagged and live topic data in a highly featured GIS environment.
openmct - A web based mission control framework.
web_video_server - HTTP Streaming of ROS Image Topics in Multiple Formats.
RVizWeb - Provides a convenient way of building and launching a web application with features similar to RViz.
marvros - MAVLink to ROS gateway with proxy for Ground Control Station.
octave - Provides a convenient command line interface for solving linear and nonlinear problems numerically, and for performing other numerical experiments using a language that is mostly compatible with Matlab.
streetscape.gl - Streetscape.gl is a toolkit for visualizing autonomous and robotics data in the XVIZ protocol.
urdf-loaders - URDF Loaders for Unity and THREE.js with example ATHLETE URDF File.
obs-studio - Free and open source software for live streaming and screen recording.
K3D-tools - Jupyter notebook extension for 3D visualization.
PyQtGraph - Fast data visualization and GUI tools for scientific / engineering applications.
ipygany - 3-D Scientific Visualization in the Jupyter Notebook.
Foxglove Studio - Web and desktop app for robotics visualization and debugging; actively maintained fork of webviz.
ROS-Mobile - Visualization and controlling application for Android.
Annotation
labelbox - The fastest way to annotate data to build and ship artificial intelligence applications.
PixelAnnotationTool - Annotate quickly images.
LabelImg - A graphical image annotation tool and label object bounding boxes in images.
cvat - Powerful and efficient Computer Vision Annotation Tool (CVAT).
point_labeler - Tool for labeling of a single point clouds or a stream of point clouds.
label-studio - Label Studio is a multi-type data labeling and annotation tool with standardized output format.
napari - A fast, interactive, multi-dimensional image viewer for python.
semantic-segmentation-editor - A web based labeling tool for creating AI training data sets (2D and 3D).
3d-bat - 3D Bounding Box Annotation Tool for Point cloud and Image Labeling.
labelme - Image Polygonal Annotation with Python (polygon, rectangle, circle, line, point and image-level flag annotation).
universal-data-tool - Collaborate & label any type of data, images, text, or documents, in an easy web interface or desktop app.
BMW-Labeltool-Lite - Provides you with a easy to use labeling tool for State-of-the-art Deep Learning training purposes.
3d-annotation-tool - Lightweight tool to annotate point clouds with bounding boxes, rectangles, keypoints and more.
Point Cloud
CloudCompare - CloudCompare is a 3D point cloud (and triangular mesh) processing software.
Potree - WebGL point cloud viewer for large datasets.
point_cloud_viewer - Makes viewing massive point clouds easy and convenient.
LidarView - Performs real-time visualization and easy processing of live captured 3D LiDAR data from Lidar sensors.
VeloView - Performs real-time visualization of live captured 3D LiDAR data from Velodyne's HDL sensors.
entwine - A data organization library for massive point clouds, designed to conquer datasets of trillions of points as well as desktop-scale point clouds.
polyscope - A C++ & Python viewer for 3D data like meshes and point clouds.
Pcx - Point cloud importer & renderer for Unity.
ImmersivePoints - A web-application for virtual reality devices to explore 3D data in the most natural way possible.
RViz
mapviz - Modular ROS visualization tool for 2D data.
rviz_cinematographer - Easy to use tools to create and edit trajectories for the rviz camera.
rviz_satellite - Display internet satellite imagery in RViz.
rviz_visual_tools - C++ API wrapper for displaying shapes and meshes in Rviz.
xpp - Visualization of motion-plans for legged robots.
rviz stereo - 3D stereo rendering displays a different view to each eye so that the scene appears to have depth.
jsk_visualization - Jsk visualization ros packages for rviz and rqt.
moveit_visual_tools - Helper functions for displaying and debugging MoveIt! data in Rviz via published markers.
Operation System
Monitoring
rosmon - ROS node launcher & monitoring daemon.
multimaster_fkie - GUI-based management environment that is very useful to manage ROS-launch configurations and control running nodes.
collectd - A small daemon which collects system information periodically and provides mechanisms to store and monitor the values in a variety of ways.
lnav - An enhanced log file viewer that takes advantage of any semantic information that can be gleaned from the files being viewed, such as timestamps and log levels.
htop - An interactive text-mode process viewer for Unix systems. It aims to be a better 'top'.
atop - System and process monitor for Linux with logging and replay function.
psutil - Cross-platform lib for process and system monitoring in Python.
gputil - A Python module for getting the GPU status from NVIDA GPUs using nvidia-smi programmically in Python.
gpustat - A simple command-line utility for querying and monitoring GPU status.
nvtop - NVIDIA GPUs htop like monitoring tool.
ShellHub - ShellHub is a modern SSH server for remotely accessing linux devices via command line (using any SSH client) or web-based user interface, designed as an alternative to sshd. Think ShellHub as centralized SSH for the the edge and cloud computing.
Sshwifty - Sshwifty is a SSH and Telnet connector made for the Web.
spdlog - Very fast, header-only/compiled, C++ logging library.
ctop - Top-like interface for container metrics.
ntop - Web-based Traffic and Security Network Traffic Monitoring.
jupyterlab-nvdashboard - A JupyterLab extension for displaying dashboards of GPU usage.
Database and Record
ncdu - Ncdu is a disk usage analyzer with an ncurses interface.
borg - Deduplicating archiver with compression and authenticated encryption.
bag-database - A server that catalogs bag files and provides a web-based UI for accessing them.
marv-robotics - MARV Robotics is a powerful and extensible data management platform.
kitti2bag - Convert KITTI dataset to ROS bag file the easy way.
pykitti - Python tools for working with KITTI data.
rosbag_editor - Create a rosbag from a given one, using a simple GUI.
nextcloud - Nextcloud is a suite of client-server software for creating and using file hosting services.
ros_type_introspection - Deserialize ROS messages that are unknown at compilation time.
syncthing - A continuous file synchronization program.
rqt_bag_exporter - Qt GUI to export ROS bag topics to files (CSV and/or video).
xviz - A protocol for real-time transfer and visualization of autonomy data.
kitti_to_rosbag - A Dataset tools for working with the KITTI dataset raw data and converting it to a ROS bag. Also allows a library for direct access to poses, velodyne scans, and images.
ros_numpy - Tools for converting ROS messages to and from numpy arrays.
kitti_ros - A ROS-based player to replay KiTTI dataset.
DuckDB - An embeddable SQL OLAP Database Management System.
Network Distributed File System
sshfs - File system based on the SSH File Transfer Protocol.
moosefs - A scalable distributed storage system.
ceph - A distributed object, block, and file storage platform.
nfs - A distributed file system protocol originally developed by Sun Microsystems.
ansible-role-nfs - Installs NFS utilities on RedHat/CentOS or Debian/Ubuntu.
Server Infrastructure and High Performance Computing
mass - Self-service, remote installation of Windows, CentOS, ESXi and Ubuntu on real servers turns your data centre into a bare metal cloud.
polyaxon - A platform for reproducing and managing the whole life cycle of machine learning and deep learning applications.
localstack - A fully functional local AWS cloud stack. Develop and test your cloud & Serverless apps offline.
nvidia-docker - Build and run Docker containers leveraging NVIDIA GPUs.
kubeflow - Machine Learning Toolkit for Kubernetes.
log-pilot - Collect logs for docker containers.
traefik - The Cloud Native Edge Router.
graylog2-server - Free and open source log management.
ansible - Ansible is a radically simple IT automation platform that makes your applications and systems easier to deploy.
pyinfra - It can be used for ad-hoc command execution, service deployment, configuration management and more.
docker-py - A Python library for the Docker Engine API.
noVNC - VNC client using HTML5.
Slurm - Slurm: A Highly Scalable Workload Manager.
jupyterhub - Multi-user server for Jupyter notebooks.
Portainer - Making Docker management easy.
enroot - A simple, yet powerful tool to turn traditional container/OS images into unprivileged sandboxes.
docker-firefox - Run a Docker Container with Firefox and noVNC for remote access to headless servers.
luigi - A Python module that helps you build complex pipelines of batch jobs. It handles dependency resolution, workflow management, visualization etc. It also comes with Hadoop support built in.
triton-inference-server - NVIDIA Triton Inference Server provides a cloud inferencing solution optimized for NVIDIA GPUs.
cudf - Provides a pandas-like API that will be familiar to data engineers & data scientists, so they can use it to easily accelerate their workflows without going into the details of CUDA programming.
Embedded Operation System
vxworks7-ros2-build - Build system to automate the build of VxWorks 7 and ROS2.
Yocto - Produce tools and processes that enable the creation of Linux distributions for embedded software that are independent of the underlying architecture of the embedded hardware.
Automotive Graded Linux - A collaborative open source project that is bringing together automakers, suppliers and technology companies to build a Linux-based, open software platform for automotive applications that can serve as the de facto industry standard.
bitbake - A generic task execution engine that allows shell and Python tasks to be run efficiently and in parallel while working within complex inter-task dependency constraints.
Jailhouse - Jailhouse is a partitioning Hypervisor based on Linux.
Xen - An open-source (GPL) type-1 or baremetal hypervisor.
QEMU - A generic and open source machine emulator and virtualizer.
qemu-xilinx - A fork of Quick EMUlator (QEMU) with improved support and modelling for the Xilinx platforms.
rosserial - A ROS client library for small, embedded devices, such as Arduino.
meta-ros - OpenEmbedded Layer for ROS Applications.
meta-balena - Run Docker containers on embedded devices.
micro-ros - The major changes compared to "regular" ROS 2 is that micro-ROS uses a Real-Time Operating System (RTOS) instead of Linux, and DDS for eXtremely Resource Constrained Environments.
nvidia-container-runtime - NVIDIA Container Runtime is a GPU aware container runtime, compatible with the Open Containers Initiative (OCI) specification used by Docker, CRI-O, and other popular container technologie.
fusesoc - Package manager and build abstraction tool for FPGA/ASIC development.
jetson_easy - Automatically script to setup and configure your NVIDIA Jetson.
docker-jetpack-sdk - Allows for usage of the NVIDIA JetPack SDK within a docker container for download, flashing, and install.
Pressed - Provides a way to set answers to questions asked during the installation process of debian, without having to manually enter the answers while the installation is running.
jetson_stats - A package to monitoring and control your NVIDIA Jetson (Xavier NX, Nano, AGX Xavier, TX1, TX2) Works with all NVIDIA Jetson ecosystem.
ros_jetson_stats - The ROS jetson-stats wrapper. The status of your NVIDIA jetson in diagnostic messages.
OpenCR - Open-source Control Module for ROS.
acrn-hypervisor - Defines a device hypervisor reference stack and an architecture for running multiple software subsystems, managed securely, on a consolidated system by means of a virtual machine manager.
jetson-containers - Machine Learning Containers for Jetson and JetPack 4.4.
Real-Time Kernel
ELISA - Project is to make it easier for companies to build and certify Linux-based safety-critical applications – systems whose failure could result in loss of human life, significant property damage or environmental damage.
PREEMPT_RT kernel patch - Aim of the PREEMPT_RT kernel patch is to minimize the amount of kernel code that is non-preemptible.
Network and Middleware
performance_test - Tool to test the performance of pub/sub based communication frameworks.
realtime_support - Minimal real-time testing utility for measuring jitter and latency.
ros1_bridge - ROS 2 package that provides bidirectional communication between ROS 1 and ROS 2.
Fast-RTPS - A Protocol, which provides publisher-subscriber communications over unreliable transports such as UDP, as defined and maintained by the Object Management Group (OMG) consortium.
protobuf - Google's data interchange format.
opensplice - Vortex OpenSplice Community Edition.
cyclonedds - Eclipse Cyclone DDS is a very performant and robust open-source DDS implementation.
iceoryx - An IPC middleware for POSIX-based systems.
rosbridge_suite - Provides a JSON interface to ROS, allowing any client to send JSON to publish or subscribe to ROS topics, call ROS services, and more.
ros2arduino - This library helps the Arduino board communicate with the ROS2 using XRCE-DDS.
eCAL - The enhanced communication abstraction layer (eCAL) is a middleware that enables scalable, high performance interprocess communication on a single computer node or between different nodes in a computer network.
AUTOSAR-Adaptive - The implementation of AUTOSAR Adaptive Platform based on the R19-11.
ocpp - The Open Charge Point Protocol (OCPP) is a network protocol for communication between electric vehicle chargers and a central backoffice system.
micro-ROS for Arduino - A experimental micro-ROS library for baremetal projects based on Arduino IDE or Arduino CLI.
mqtt_bridge - Provides a functionality to bridge between ROS and MQTT in bidirectional.
Ethernet and Wireless Networking
SOES - SOES is an EtherCAT slave stack written in C.
netplan - Simply create a YAML description of the required network interfaces and what each should be configured to do.
airalab - AIRA is reference Robonomics network client for ROS-enabled cyber-physical systems.
rdbox - RDBOX is a IT infrastructure for ROS robots.
ros_ethercat - This is a reimplementation of the main loop of pr2_ethercat without dependencies on PR2 software.
wavemon - An ncurses-based monitoring application for wireless network devices.
wireless - Making info about wireless networks available to ROS.
ptpd - PTP daemon (PTPd) is an implementation the Precision Time Protocol (PTP) version 2 as defined by 'IEEE Std 1588-2008'. PTP provides precise time coordination of Ethernet LAN connected computers.
iperf - A TCP, UDP, and SCTP network bandwidth measurement tool.
tcpreplay - Pcap editing and replay tools.
nethogs - It groups bandwidth by process.
pyshark - Python wrapper for tshark, allowing python packet parsing using wireshark dissectors.
pingtop - Ping multiple servers and show results in a top-like terminal UI.
termshark - A terminal UI for tshark, inspired by Wireshark.
udpreplay - Replay UDP packets from a pcap file.
openwifi - Linux mac80211 compatible full-stack IEEE802.11/Wi-Fi design based on Software Defined Radio.
Controller Area Network
awesome CAN - A curated list of awesome CAN bus tools, hardware and resources.
AndrOBD - Android OBD diagnostics with any ELM327 adapter.
ddt4all - DDT4All is a tool to create your own ECU parameters screens and connect to a CAN network with a cheap ELM327 interface.
cabana - CAN visualizer and DBC maker.
opendbc - The project to democratize access to the decoder ring of your car.
libuavcan - An open lightweight protocol designed for reliable communication in aerospace and robotic applications over robust vehicular networks such as CAN bus.
python-can - The can package provides controller area network support for Python developers.
CANopenNode - The internationally standardized (EN 50325-4) (CiA301) CAN-based higher-layer protocol for embedded control system.
python-udsoncan - Python implementation of UDS (ISO-14229) standard.
uds-c - Unified Diagnostics Service (UDS) and OBD-II (On Board Diagnostics for Vehicles) C Library.
cantools - CAN BUS tools in Python 3.
CANdevStudio - CANdevStudio aims to be cost-effective replacement for CAN simulation software. It can work with variety of CAN hardware interfaces.
can-utils - Linux-CAN / SocketCAN user space applications.
ros_canopen - CANopen driver framework for ROS.
decanstructor - The definitive ROS CAN analysis tool.
kvaser_interface - This package was developed as a standardized way to access Kvaser CAN devices from ROS.
canmatrix - Converting CAN Database Formats .arxml .dbc .dbf .kcd.
autosar - A set of python modules for working with AUTOSAR XML files.
canopen - A Python implementation of the CANopen standard. The aim of the project is to support the most common parts of the CiA 301 standard in a Pythonic interface.
SavvyCAN - A Qt5 based cross platform tool which can be used to load, save, and capture canbus frames.
Open-Vehicle-Monitoring-System-3 - The system provides live monitoring of vehicle metrics like state of charge, temperatures, tyre pressures and diagnostic fault conditions.
Sensor and Acuator Interfaces
Tesla-API - Provides functionality to monitor and control the Model S (and future Tesla vehicles) remotely.
flirpy - A Python library to interact with FLIR thermal imaging cameras and images.
nerian_stereo - ROS node for Nerian's SceneScan and SP1 stereo vision sensors.
pymmw - This is a toolbox composed of Python scripts to interact with TI's evaluation module (BoosterPack) for the IWR1443 mmWave sensing device.
ti_mmwave_rospkg - TI mmWave radar ROS driver (with sensor fusion and hybrid).
pacmod3 - This ROS node is designed to allow the user to control a vehicle with the PACMod drive-by-wire system, board revision 3.
ros2_intel_realsense - These are packages for using Intel RealSense cameras (D400 series) with ROS2.
sick_scan - This stack provides a ROS2 driver for the SICK TiM series of laser scanners.
ouster_example - Sample code for connecting to and configuring the OS1, reading and visualizing data, and interfacing with ROS.
ros2_ouster_drivers - These are an implementation of ROS2 drivers for the Ouster OS-1 3D lidars.
livox_ros_driver - A new ROS package, specially used to connect LiDAR products produced by Livox.
velodyne - A collection of ROS packages supporting Velodyne high definition 3D LIDARs.
ublox - Provides support for u-blox GPS receivers.
crazyflie_ros - ROS Driver for Bitcraze Crazyflie.
pointgrey_camera_driver - ROS driver for Pt. Grey cameras, based on the official FlyCapture2 SDK.
novatel_gps_driver - ROS driver for NovAtel GPS / GNSS receivers.
pylon-ros-camera - The official pylon ROS driver for Basler GigE Vision and USB3 Vision cameras.
ethz_piksi_ros - Contains (python) ROS drivers, tools, launch files, and wikis about how to use Piksi Real Time Kinematic (RTK) GPS device in ROS.
sick_safetyscanners - A ROS Driver which reads the raw data from the SICK Safety Scanners and publishes the data as a laser_scan msg.
bosch_imu_driver - A driver for the sensor IMU Bosch BNO055. It was implemented only the UART communication interface (correct sensor mode should be selected).
oxford_gps_eth - Ethernet interface to OxTS GPS receivers using the NCOM packet structure.
ifm3d - Library and Utilities for working with ifm pmd-based 3D ToF Cameras.
cepton_sdk_redist - Provides ROS support for Cepton LiDAR.
jetson_csi_cam - A ROS package making it simple to use CSI cameras on the Nvidia Jetson TK1, TX1, or TX2 with ROS.
ros_astra_camera - A ROS driver for Orbbec 3D cameras.
spot_ros - ROS Driver for Spot.
blickfeld-scanner-lib - Cross-platform library to communicate with LiDAR devices of the Blickfeld GmbH.
TauLidarCamera - The host-side API for building applications with the Tau LiDAR Camera.
Security
owasp-threat-dragon-desktop - Threat Dragon is a free, open-source, cross-platform threat modeling application including system diagramming and a rule engine to auto-generate threats/mitigations.
launch_ros_sandbox - Can define launch files running nodes in restrained environments, such as Docker containers or separate user accounts with limited privileges.
wolfssl - A small, fast, portable implementation of TLS/SSL for embedded devices to the cloud.
CANalyzat0r - Security analysis toolkit for proprietary car protocols.
RSF - Robot Security Framework (RSF) is a standardized methodology to perform security assessments in robotics.
How-to-Secure-A-Linux-Server - An evolving how-to guide for securing a Linux server.
lynis - Security auditing tool for Linux, macOS, and UNIX-based systems. Assists with compliance testing (HIPAA/ISO27001/PCI DSS) and system hardening.
OpenVPN - An open source VPN daemon.
openfortivpn - A client for PPP+SSL VPN tunnel services and compatible with Fortinet VPNs.
WireGuard - WireGuard is a novel VPN that runs inside the Linux Kernel and utilizes state-of-the-art cryptography.
ssh-auditor - Scans for weak ssh passwords on your network.
vulscan - Advanced vulnerability scanning with Nmap NSE.
nmap-vulners - NSE script based on Vulners.com API.
brutespray - Automatically attempts default creds on found services.
fail2ban - Daemon to ban hosts that cause multiple authentication errors.
DependencyCheck - A software composition analysis utility that detects publicly disclosed vulnerabilities in application dependencies.
Firejail - A SUID sandbox program that reduces the risk of security breaches by restricting the running environment of untrusted applications using Linux namespaces, seccomp-bpf and Linux capabilities.
RVD - Robot Vulnerability Database. Community-contributed archive of robot vulnerabilities and weaknesses.
ros2_dds_security - Adding security enhancements by defining a Service Plugin Interface (SPI) architecture, a set of builtin implementations of the SPIs, and the security model enforced by the SPIs.
Security-Enhanced Linux - A Linux kernel security module that provides a mechanism for supporting access control security policies, including mandatory access controls (MAC).
OpenTitan - Will make the silicon Root of Trust design and implementation more transparent, trustworthy, and secure for enterprises, platform providers, and chip manufacturers. OpenTitan is administered by lowRISC CIC as a collaborative project to produce high quality, open IP for instantiation as a full-featured product.
bandit - A tool designed to find common security issues in Python code.
hardening - A quick way to make a Ubuntu server a bit more secure.
Passbolt - Passbolt is a free and open source password manager that allows team members to store and share credentials securely.
gopass - A password manager for the command line written in Go.
pass - The standard unix password manager.
Vault - A tool for securely accessing secrets. A secret is anything that you want to tightly control access to, such as API keys, passwords, certificates, and more.
legion - An open source, easy-to-use, super-extensible and semi-automated network penetration testing framework that aids in discovery, reconnaissance and exploitation of information systems.
openscap - The oscap program is a command line tool that allows users to load, scan, validate, edit, and export SCAP documents.
Datasets
Papers With Code - Thousands of machine learning datasets provided by Papers With Code.
KITTI-360 - This large-scale dataset contains 320k images and 100k laser scans in a driving distance of 73.7km.
waymo_ros - This is a ROS package to connect Waymo open dataset to ROS.
waymo-open-dataset - The Waymo Open Dataset is comprised of high-resolution sensor data collected by Waymo self-driving cars in a wide variety of conditions.
Ford Autonomous Vehicle Dataset - Ford presents a challenging multi-agent seasonal dataset collected by a fleet of Ford autonomous vehicles at different days and times.
awesome-robotics-datasets - A collection of useful datasets for robotics and computer vision.
nuscenes-devkit - The devkit of the nuScenes dataset.
dataset-api - This is a repo of toolkit for ApolloScape Dataset, CVPR 2019 Workshop on Autonomous Driving Challenge and ECCV 2018 challenge.
utbm_robocar_dataset - EU Long-term Dataset with Multiple Sensors for Autonomous Driving.
DBNet - A Large-Scale Dataset for Driving Behavior Learning.
argoverse-api - Official GitHub repository for Argoverse dataset.
DDAD - A new autonomous driving benchmark from TRI (Toyota Research Institute) for long range (up to 250m) and dense depth estimation in challenging and diverse urban conditions.
pandaset-devkit - Public large-scale dataset for autonomous driving provided by Hesai & Scale.
a2d2_to_ros - Utilities for converting A2D2 data sets to ROS bags.
awesome-satellite-imagery-datasets - List of satellite image training datasets with annotations for computer vision and deep learning.
sentinelsat - Search and download Copernicus Sentinel satellite images.
adas-dataset-form - Thermal Dataset for Algorithm Training.
h3d - The H3D is a large scale full-surround 3D multi-object detection and tracking dataset from Honda.
Mapillary Vistas Dataset - A diverse street-level imagery dataset with pixel‑accurate and instance‑specific human annotations for understanding street scenes around the world.
TensorFlow Datasets - TensorFlow Datasets provides many public datasets as tf.data.Datasets.
racetrack-database - Contains center lines (x- and y-coordinates), track widths and race lines for over 20 race tracks (mainly F1 and DTM) all over the world.
BlenderProc - A procedural Blender pipeline for photorealistic training image generation.
Atlatec Sample Map Data - 3D map for autonomous driving and simulation created from nothing but two cameras and GPS in downtown San Francisco.
Lyft Level 5 Dataset - Level 5 is developing a self-driving system for the Lyft network. We're collecting and processing data from our autonomous fleet and sharing it with you.
holicity - A City-Scale Data Platform for Learning Holistic 3D Structures.
UTD19 - Largest multi-city traffic dataset publically available.
ASTYX HIRES2019 DATASET - Automotive Radar Dataset for Deep Learning Based 3D Object Detection.
Objectron - A collection of short, object-centric video clips, which are accompanied by AR session metadata that includes camera poses, sparse point-clouds and characterization of the planar surfaces in the surrounding environment.
ONCE dataset - A large-scale autonomous driving dataset with 2D&3D object annotations.
Footnotes
Thanks to the team of xpp for creating this awesome GIF we use.

About
Tooling for professional robotic development in C++ and Python with a touch of ROS, autonomous driving and aerospace.

Topics
python machine-learning awesome robot cplusplus cpp robotics mapping aerospace point-cloud artificial-intelligence ros lidar self-driving-car awesome-list automotive slam autonomous-driving robotic ros2
Resources
 Readme
License
 CC0-1.0 license
Contributing
 Contributing
 Activity
Stars
 3.6k stars
Watchers
 109 watching
Forks
 528 forks
Report repository
Contributors
29
@Ly0n
@af-silva
@horverno
@ariexi
@esthersweon
@TobiasCy
@DavidMansolino
@JacopoPan
@peci1
@LoyVanBeek
@kscottz
@fdietze
@kekeblom
@pantor
+ 15 contributors
Footer
© 2025 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information

## https://github.com/fkromer/awesome-ros2
Skip to content
Navigation Menu
Platform
Solutions
Resources
Open Source
Enterprise
Pricing

Search or jump to...
Sign in
Sign up
This repository was archived by the owner on Mar 20, 2024. It is now read-only.
fkromer
/
awesome-ros2
Public archive
Code
Pull requests
Actions
Security
Insights
fkromer/awesome-ros2
Go to file
Name		
 
.travis.yml
 
 
LICENSE.md
 
 
_config.yml
 
 
code-of-conduct.md
 
 
contributing.md
 
 
readme.md
 
 
ros_logo.svg
 
 
Repository files navigation
README
Code of conduct
Contributing
License
Awesome Robot Operating System 2 (ROS 2) Awesome


A curated list of awesome Robot Operating System Version 2.0 (ROS 2) resources and libraries.

The Robot Operating System 2 (ROS 2) is a set of software libraries and tools that help you build robot applications. From drivers to state-of-the-art algorithms, and with powerful developer tools, ROS 2 has what you need for your next robotics project. And it’s all open source.

DEPRECATION NOTICE: This repository is in the process of beeing handed over to Open Robotics. Feel free to checkout the GitHub ROS2 organization to find the repo there in the future.

Contents
Packages
Forks
Operating systems
Packaging
Documentation
Community
Books
Courses
Presentations
Papers
Podcasts
Services
Companies
Organizations
Working groups
Packages
Data collection
ros2_data_collection - Collect, validate and send data reliably from ROS 2 to create APIs and dashboards. ros2_data_collection
Demonstrations
adlink_ddsbot - The ROS 2.0/1.0 based robots swarm architecture (opensplice DDS). adlink_ddsbot
adlink_neuronbot - ROS2/DDS robot pkg for human following and swarm. adlink_neuronbot
turtlebot3 - ROS2 based TurtleBot3 demo including Bringup, Teleop and Cartographer. turtlebot3
Examples
turtlebot2_demo - TurtleBot 2 demos using ROS 2. turtlebot2_demo
examples/rclcpp - C++ examples. ros2/examples
examples/rclpy - Python examples. ros2/examples
rcljava_examples - Package containing examples of how to use the rcljava API. ros2_java_examples
ros2_talker_android, ros2_listener_android - Example Android apps for the ROS2 Java bindings. ros2_android_examples
zed-ros2-examples - Examples and tutorials use the ZED cameras in the ROS2. zed_ros2_example
realsense-ros:ros2-branch - ROS2 Wrapper for Intel® RealSense™ Devices realsense-ros
Benchmarking
ros2_benchmarking - Framework for ROS2 benchmarking. ROS2 communication characteristics can be evaluated on several axes, quickly and in an automated way. ros2_benchmarking
performance_test - Test performance and latency of various communication means like ROS 2, FastRTPS and Connext DDS Micro. performance_test
Containerization
docker-ros2-ospl-ce - A dockerfile to build a ROS2 + OpenSplice CE container. docker-ros2-ospl-ce
ros2_java_docker - Dockerfiles for building ros2_java with OpenJDK and Android. ros2_java_docker
micro-ROS/docker - Docker-related material to setup, configure and develop with micro-ROS hardware.
ros-tooling/cross_compile - Cross compile ROS and ROS 2 workspaces to non-native architectures and generate corresponding Docker images.
ros2-docker - Connecting ROS 2 nodes running in Docker containers over the internet.
osrf/docker_images - Dockerfiles of Official Library on Docker Hub and OSRF Organization on Docker Hub. osrf/ros
docker-ros2-desktop-vnc - Dockerfiles to provide HTML5 VNC interface to access Ubuntu LXDE + ROS2. docker-ros2-desktop-vnc
ros2-lxd - Install ROS 2 Humble in Ubuntu 20.04 or 18.04 using LXD containers.
Networking
Husarnet VPN - A P2P, secure network layer dedicated for ROS & ROS 2. husarnet
Ecosystem
Link ROS - Cloud Logging for ROS 1 and ROS 2.
rosbag2 - ROS2 native rosbag. rosbag2
rviz - 3D Robot Visualizer. rviz
urdfdom - URDF (U-Robot Description Format) library which provides core data structures and a simple XML parser urdfdom
urdfdom_headers - Headers for URDF parsers. urdfdom_headers
ros2cli - ROS 2 command line tools. ros2cli
orocos_kinematics_dynamics - Orocos Kinematics and Dynamics C++ library. orocos_kinematics_dynamics
pydds - Simple DDS Python API for Vortex Lite and for OpenSplice. pydds
Webots - Robot simulator for ROS 2. webots
LGSVL - Simulation software to accelerate safe autonomous vehicle development.
Unity Robotics Hub - This is a central repository for tools, tutorials, resources, and documentation for robotic simulation in Unity.
Foxglove Studio - Integrated visualization and diagnosis tool for robotics. foxglove studio
ROS2 For Unity - An asset package which enables high-performance communication between Unity3D simulations and ROS2 ecosystem. ros2-for-unity
Interactivity
Jupyter ROS2 - Jupyter widget helpers for ROS2.
Penetration testing
aztarna - A footprinting tool for robots.
ros2_fuzzer - ROS2 Topic & Service Fuzzer.
Application layer
Apex.Autonomy - Apex.Autonomy provides autonomy algorithms as individual building blocks and is compatible with Autoware.Auto.
Autoware.Auto - Autoware.Auto provides an open-source software stack based on ROS 2 for self-driving technology.
ros2_control - ros2_control is a proof of concept on how new features within ROS 2 can be elaborated and used in the context of robot control (ros2_controllers). ros2_control
ros2_controllers - Description of ros_controllers. ros2_controllers
geometry2 - A set of ROS packages for keeping track of coordinate transforms. geometry2
ros2-ORB_SLAM2 - ROS2 node wrapping the ORB_SLAM2 library. ros2-ORB_SLAM2
basalt_ros2 - ROS2 wrapper for Basalt VIO. basalt_ros2
cartographer - Real-time simultaneous localization and mapping (SLAM) in 2D and 3D across multiple platforms and sensor configurations. cartographer
slam_gmapping - Slam Gmapping for ROS2. slam_gmapping
slam_toolbox - Slam Toolbox for lifelong mapping and localization in potentially massive maps with ROS. slam_toolbox
lidarslam_ros2 - ROS2 package of 3D lidar slam using ndt/gicp registration and pose-optimization. lidarslam_ros2
li_slam_ros2 - ROS2 package of tightly-coupled lidar inertial ndt/gicp slam referenced from LIO-SAM. li_slam_ros2
octomap_server2 - ROS2 stack for mapping with OctoMap. Port of the ROS1 octomap_mapping package. octomap_server2
vision_opencv - Packages for interfacing ROS2 with OpenCV. vision_opencv
teleop_twist_keyboard - Generic Keyboard Teleop for ROS2. teleop_twist_keyboard
teleop_twist_joy - Simple joystick teleop for twist robots. teleop_twist_joy
navigation - ROS2 Navigation stack. navigation
diagnostics - Forked version of the original ROS1 Diagnostics for ROS 2 (currently diagnostics_updater only). diagnostics
robot_state_publisher - Forked version of the original ROS Robot State Publisher with all modifications to compile within a ROS2 Ecosystem. robot_state_publisher
common_interfaces - A set of packages which contain common interface files (.msg and .srv). common_interfaces
ros2_object_map - "Mark tag of objects on map when SLAM". ros2_object_map
ros2_object_analytics - Object Analytics (OA) is ROS2 wrapper for realtime object detection, localization and tracking. ros2_object_analytics
ros2_intel_movidius_ncs - ROS2 wrapper for Movidius™ Neural Compute Stick (NCS) Neuronal Compute API. ros2_intel_movidius_ncs
ros2_moving_object - Addressing moving objects based on messages generated by Object Analytics ros2_object_analytics. ros2_moving_object
ros2_openvino_toolkit - ROS2 wrapper for CV API of OpenVINO™ (human vision emulation). ros2_openvino_toolkit
ros2_grasp_library - Probably a grasp library :). ros2_grasp_library
apriltag_ros - ROS2 node for AprilTag detection. apriltag_ros
rosbridge_suite - Bridging your browser to the ROS 2.0. rosbridge_suite
ros2_message_filters - ros2_message_filters blends various messages based on the conditions that filter needs to met and derives from ROS2 porting of ROS message_filters. ros2_message_filters
ros2-tensorflow - ROS2 nodes for computer vision tasks in Tensorflow. ros2-tensorflow
ros2_pytorch - ROS2 nodes for computer vision tasks in PyTorch ros2_pytorch.
ros2_pytorch_cuda - Extension of ros2_pytorch for CUDA devices with containerization.
pid - A PID controller for ROS2. pid
system-modes - System modes for ROS 2 and micro-ROS.
darknet_ros - ROS2 wrapper for deploying Darknet's YOLO Computer Vision model.
easy_perception_deployment - Package that accelerates training and deployment of Computer Vision models for industries. easy_perception_deployment
easy_manipulation_deployment - Package that integrates perception elements to establish an end-to-end pick and place task. easy_manipulation_deployment
ros2_pid_library - A ROS2 Humble fully configurable PID library ros2_pid_library
wayp_plan_tools - Waypoint and planner tools for ROS 2 with minimal dependencies and an optional Gazebo Fortress simulation. wayp_plan_tools
Middleware
Micro XRCE-DDS Agent - Micro XRCE-DDS Agent acts as a server between DDS Network and Micro XRCE-DDS Clients.
Micro XRCE-DDS Agent docker - Docker image containing the Micro XRCE-DDS Agent.
Micro XRCE-DDS Client - Micro XRCE-DDS implements a client-server protocol to enable resource-constrained devices (clients) to take part in DDS communications.
micro-ROS-Agent - ROS 2 package using Micro XRCE-DDS Agent.
Eclipse Zenoh - Zenoh is a scalable and extremely performant protocol that can be used transparently used to interact with ROS2 applications as well as for R2X communication. (https://img.shields.io/github/stars/eclipse-zenoh/zenoh)
Eclipse Zenoh-Plugin-DDS - This is a zenoh plugin that allows to transparently route ROS2/DDS data over zenoh. This is commonly used for R2X communication over Wireless network or across the Internet. (https://img.shields.io/github/stars/eclipse-zenoh/zenoh-plugin-dds)
"System" bindings
rclandroid - Android API for ROS2. rclandroid
rclnodejs - Node.js version of ROS2.0 client. rclnodejs
riot-ros2 - This project enables ROS2 to run on microcontrollers using the RIOT Operating System. riot-ros2
ROS2-Integration-Service - ROS2 Integration and Routing which provides a complete tool to integrate other technologies with ROS2 easily and enable ROS2 on WAN/Internet.
soss - The System Of Systems Synthesizer is used to integrate ROS2 via ROS2-Integration-Service with other (communication) systems.
micro_ros_arduino - Integration of micro-ROS into Arduino software platform projects.
micro_ros_zephyr_module - Integration of micro-ROS in Zeyphr OS based projects.
Driver layer
Autoware.IO - Autoware.IO provides a heterogeneous hardware reference platform and enables the integration of member company's solutions onto platforms which support the Autoware.Auto and Autoware.AI software stack.
ros2_xmlrpc_interface - ros2 interface package with xmlrpc, to communicate with a Sesto server using Sesto API. ros2_xmlrpc
cozmo_driver_ros2 - Unofficial Anki Cozmo node for ROS2. cozmo_driver_ros2
sphero_ros2 - ROS2 sphero driver. sphero_ros2
flock2 - ROS2 driver for DJI Tello drones. flock2
ros2_raspicam_node - ROS2 node for Raspberry Pi camera. ros2_raspicam_node
joystick_drivers - ROS2 drivers for joysticks. joystick_drivers
joystick_drivers_from_scratch - Joystick driver packages for ROS 2. joystick_drivers_from_scratch
joystick_ros2 - Joystick driver for ROS2, support all platforms: Linux, macOS, Windows. joystick_ros2
ros2_teleop_keyboard - Teleop Twist Keyboard for ROS2. ros2_teleop_keyboard
ros_astra_camera - ROS2 wrapper for Astra camera. ros_astra_camera
ros2_usb_camera - ROS2 General USB camera driver. ros_astra_camera
ros2_android_drivers - Collection of ROS2 drivers for several Android sensors. ros2_android_drivers
ros2_intel_realsense - ROS2 Wrapper for Intel® RealSense™ Devices. ros2_intel_realsense
raspicam2_node - ROS2 node for camera module of Raspberry Pi. raspicam2_node
ros2_track_imu - ROS2 node for TrackIMU IMU sensorros2_track_imu.
HRIM - A standard interface for robot modules.
FIROS2 - ROS2 integrable tool focused in the intercommunication between ROS2 and FIWARE. FIROS2
lino2_upper - Linorobot on ROS2. lino2_upper
RysROS2 - ROS2 software stack for MiniRys robots. RysROS2
px4_to_ros - ROS2/ROS packages for communicate PX4 with ROS. px4_to_ros
multiwii_ros2 - ROS2 Node for MultiWii and Cleanflight flight controllers. multiwii_ros2
ydlidar_ros2 - ROS2 wrapper for ydlidar. ydlidar_ros2
zed-ros2-wrapper - ROS 2 wrapper beta for the ZED SDK.
ros2_denso_radar - Toyota/Lexus 2015-2017 Denso Radar driver for ROS2.
sick_scan2 - ROS2 driver for the SICK TiM series of laser scanners (TiM551/TiM561/TiM571).
ros2_ouster_drivers - ROS2 Drivers for the Ouster OS-1 Lidars. ros2_ouster_drivers
micro-ROS/hardware - Information and documentation about the hardware platforms used and supported in the micro-ROS project.
Blickfeld Cube 1 & Cube Range - ROS2 drivers for Blickfeld Cube 1 & Cube Range.
Universal Robots - ROS2 drivers for UR CB3 and e-Series.
odrive_ros2_control - ODrive driver for ros2_control.
duro_gps_driver - ROS/ROS2 driver for SwiftNav Duro Inertial GPS / GNSS receivers duro_gps_driver
Client libraries
rclada - ROS Client Library for Ada. rclada
rclcpp - ROS Client Library for C++. rclcpp
rclgo - ROS Client Library for Go. rclgo
rclpy - ROS Client Library for Python. rclpy
rcljava - ROS Client Library for Java. rcljava
rclnodejs - ROS Client Library for Node.js. rclnodejs
rclobjc - ROS Client Library for Objective C (for iOS). rclobjc
rclc - ROS Client Library for C. rclc
ros2_rust - Rust bindings for ROS2. ros2_rust
ros2_dotnet - .NET bindings for ROS2. ros2_dotnet
ros2cs - an alternative to ros2_dotnet, a ROS2 C# interface supporting full range of messages and modern ROS2. ros2cs
Client libraries common
rcl - Library to support implementation of language specific ROS Client Libraries. rcl
system_tests - Tests for rclcpp and rclpy. system_tests
rcl_interfaces - A repository for messages and services used by the ROS client libraries. rcl_interfaces
IDL generators
rosidl_generator_java - Generate the ROS interfaces in Java. ros2_java
rosidl_generator_objc - Generate the ROS interfaces in Objective C. ros2_objc
rosidl_generator_cpp - Generate the ROS interfaces in C++. rosidl
rosidl_generator_c - Generate the ROS interfaces in C. rosidl
rosidl - Packages which provide the ROS IDL (.msg) definition and code generation. rosidl
rosidl_dds - Generate the DDS interfaces for ROS interfaces. rosidl_dds
RMW (ROS middleware)
rmw - Contains the ROS middleware API. rmw
rmw_connext_cpp - Implement the ROS middleware interface using RTI Connext static code generation in C++. rmw_connext_cpp
rmw_fastrtps_cpp - Implement the ROS middleware interface using eProsima FastRTPS static code generation in C++. rmw_fastrtps_cpp
rmw_dps - Implementation of the ROS Middleware (rmw) Interface using Intel's Distributed Publish & Subscribe. rmw_dps
rmw_opensplice_cpp - Implement the ROS middleware interface using PrismTech OpenSplice static code generation in C++. rmw_opensplice_cpp
rmw_coredx - CoreDX DDS integration layer for ROS2. tocinc/rmw_coredx
rmw_freertps - RMW implementation using freertps. tocinc/rmw_coredx
rmw_zenoh - RMW implementation using Eclipse zenoh: Zero Overhead Pub/sub, Store/Query and Compute. atolab/rmw_zenoh
rcutils - Common C functions and data structures used in ROS 2. rmw
freertps - a free, portable, minimalist, work-in-progress RTPS implementation. rmw
rmw_cyclonedds - ROS2 RMW layer for Eclipse Cyclone DDS. rmw_cyclonedds
rmw_zenoh - ROS2 RMW layer for zenoh.
rmw_iceoryx - Enables usage of the inter-process-communication middleware Eclipse iceoryx.
DDS communication mechanism implementations
Connext DDS - Connectivity Software for Developing and Integrating IIoT Systems. 💲
Fast-RTPS - Implementation of RTPS Standard (RTPS is the wire interoperability protocol for DDS). Fast-RTPS
OpenSplice - Implementation of the OMG DDS Standard. opensplice 💲
CoreDX DDS - Implementation of Twin Oaks Computing, Inc.. 💲
freertps - A free, portable, minimalist, work-in-progress RTPS implementation. freertps
cdds - Cyclone DDS is developed completely in the open and is undergoing the acceptance process to become part of Eclipse IoT. cdds
Micro-XRCE-DDS) - An XRCE DDS implementation (supported by microROS). Micro-XRCE-DDS
Build system (Linux)
meta-ros2 - ROS 2 Layer for OpenEmbedded Linux. meta-ros2
Build system (ROS2)
ci - ROS 2 CI Infrastructure. ci
ament_cmake_export_jars - The ability to export Java archives to downstream packages in the ament buildsystem in CMake. ros2_java
rmw_implementation_cmake - CMake functions which can discover and enumerate available implementations. rmw
rmw_implementation - CMake infrastructure and dependencies for rmw implementations. rmw
Operating systems
NuttX - NuttX fork of the official one for use with micro-ROS.
RIOT - RIOT is a real-time multi-threading operating system (...,) real-time capabilities, small memory footprint, (...) API offers partial POSIX compliance.
eMCOS - POSIX-compliant real-time OS for many-core processors expected to support AUTOSAR in the future.
PYNQ - Python-based rapid prototyping of high performance ML applications running on XILINX FPGAs.
ReconROS - Framework for ROS2 FPGA-based hardware acceleration. Based on ReconOS. ReconROS
Ubuntu Core - Build secure IoT devices with Ubuntu Core.
Ubuntu Server
VxWorks - The Secure, Safe, Reliable, and Certifiable real-time OS for Critical Infrastructure
Zephyr - Linux Foundation Projects RTOS aiming at beeing secure and safe.
Packaging
ros2-snap - Create a snap for your ROS 2 application.
Forks
Apex.OS - Apex.OS is a fork of ROS 2 that has been made so robust and reliable that it can be used in safety-critical applications.
Documentation
ROS Index - Future single entry point into ROS2 documentation (BETA).
Foxy packages.
Dashing packages.
Crystal packages.
Bouncy packages.
Ardent packages.
ROS 2 Design - Articles which inform and guide the ROS 2.0 design efforts.
ROS 2 Docs (Overview) - Details about ROS 2 internal design and organisation.
ROS 2 Tutorials - Study about ROS2 concept, libraries, build, and development with demoes/examples.
ROS 2 Wiki - Entry point to find all kind of information about ROS 2.
ROS 2 Distribution (rosdistro) - Info about distributions and the included packages.
ROS2 package status.
Bouncy package status - Status of ROS Bouncy packages.
Ardent package status - Status of ROS2 Ardent packages.
ROS2 Buildfarm - Build information (Jenkins build farm).
ROS2 CLI cheats sheet - A cheats sheet for ROS 2 Command Line Interface.
ROS2 Quality Assurance Guidelines - A collection of guidelines and tutorials for improving package quality, following REP-2004 quality standards and integrating Continuous Integration.
Community
ROS Discourse
ROS Answers
ROS News
ROS Planet
Stack Overflow
Books
A Concise Introduction to Robot Programming with ROS2
Courses
ROS2 How To: Discover Next Generation ROS (Udemy)
ROS 2 New Features: Skill-up with the latest features of Robot Operating System 2 (Udemy)
ROS 2 Basics in 5 Days (C++) - Learn how to start working with ROS 2 (The Construct)
ROS2 Autoware Course
Autoware Course Lecture 1: Development Environment
Autoware Course Lecture 2: ROS2 101
Autoware Course Lecture 3: ROS 2 Tooling - Develop Like a Pro
Autoware Course Lecture 4: Platform HW, RTOS and DDS
Autoware Course Lecture 5: Autonomous Driving Stacks
Autoware Course Lecture 6: Autoware 101
Autoware Course Lecture 7: Object Perception: LIDAR
Autoware Course Lecture 8: Object Perception: CAMERA
Autoware Course Lecture 9: Object Perception: Radar
Autoware Course Lecture 10: State Estimation for Localization
Autoware Course Lecture 11: LGSVL Simulator
Autoware Course Lecture 12: Motion Control
ROS2-Industrial training material
Presentations
ROSCon 2022
Program announcement(slides + videos)

Panel: The ROS 2 Developer Experience video
Wearable ROS: Development of wearable robot system using ROS 2 video slides
Building ROS 2 enabled Android apps with C++ video slides
Distributed Robotics Simulator with Unreal Engine video slides
Tools and processes for improving the certifiability of ROS 2 video slides
Failover ROS Framework : Consensus-based node redundancy video slides
ROS 2 and Gazebo Integration Best Practices video slides
Chain-Aware ROS Evaluation Tool (CARET) video slides
ROS 2 network monitoring video slides
How custom tasks are defined, assigned, and executed in Open-RMF video slides
A practitioner's guide to ros2_control video slides
Zenoh: How to Make ROS 2 Work at any Scale and Integrate with Anything video slides
A case study in optics manufacturing with MoveIt2 and ros2_control video slides
20/20 Robot Vision - How to setup cameras in ROS 1 & ROS 2 using camera_aravis video slides
Filter your ROS 2 content video slides
Evolving Message Types, and Other Interfaces, Over Time video slides
Migrating from ROS1 to ROS 2 - choosing the right bridge video slides
On Use of Nav2 Smac Planners video slides
Bazel and ROS 2 – building large scale safety applications video slides
Native Rust components for ROS 2 video slides
The ROS build farm and you: How ROS packages you release become binary packages. video slides
mROS 2: yet another runtime environment onto embedded devices video slides
ROS 2 & Edge Impulse: Embedded AI in robotics applications video slides
micro-ROS goes Automotive: supporting AUTOSAR-based microcontrollers video slides
An open architecture for Hardware Acceleration in ROS 2 video slides
ROS 2 and the Crazyflie: Aerial swarms and Autonomy with a tiny flying robot video slides
A Raspberry Pi image with ROS 2 + RT and a customizable image builder video slides
ROSCon 2021
Program announcement(slides + videos)

ROSCon Jp 2021
Program announcement(slides + videos)

ROSCon 2020
Program announcement(slides + videos)

ROSCon 2019
Program announcement(slides + videos)

ROSCon Fr 2019
Program announcement(slides + videos)

ROS-I EU Spring 2019 Workshop
Current Status of ROS 2 Hands-on Feature Overview Slides
2019
Robot Modularity with Xilinx and H-ROS (Xilinx Inc.) Video
ROSCon JP 2018 (english slide presentations only)
What's next for ROS? (from slide 24 onwards) Slides Video
ROSCon 2018
program announcement

Hands-on ROS 2: A Walkthrough
ROS 2 on Autonomous Driving Vehicles
RViz – The tale of a migration to ROS 2.0
Launch for ROS 2
Getting involved in ROS 2 development
Planning to Plan: Plugins All The Way Down
Leveraging DDS Security in ROS2
Arm DDS Security library: Adding secure security to ROS2
ROS2: Supercharging the Jaguar4x4
Performance Test - A Tool for Communication Middleware Performance Measuring
ROS2 for Android, iOS and Universal Windows Platform: a demonstration of ROS2’s portability, and cross-platform and cross-language capabilities
Integrating ROS and ROS2 on mixed-critical robotic systems based on embedded heterogeneous platforms
Towards ROS 2 microcontroller meta cross-compilation
Node.js Client & Web Bridge Ready for ROS 2.0
RCLAda: the Ada client library for ROS2
Embedded World Conference 2018
ADLink Neuron: An industrial oriented ROS2-based platform Slides Video Video
2018
ROS2 - The Robot Operating System Version 2 (TNG Technology Consulting GmbH) Slides Video
ROS Industrial Conference 2017
micro Robot Operating System: ROS for highly resource-constrained devices Slides
ROS2 - it's coming Slides
ROSCon 2017
The ROS 2 vision for advancing the future of robotics development Slides Video
ROS2 Fine Tuning Slides Video
SLAM on Turtlebot2 using ROS2 Slides Video
Using ROS2 for Vision-Based Manipulation with Industrial Robots Slides Video
2017
HyphaROS ROS 2.0 Introduction slides
ROS Industrial Conference 2016
ROS 2.0 AND OPC UA: A STATUS UPDATE Slides
ROSCon 2016
ROS 2 Update Slides Video
Evaluating the resilience of ROS2 communication layer Slides Video
ROSCon 2015
ROS 2 on “small” embedded systems Slides Video
State of ROS 2 - demos and the technology behind Slides Video
Real-time Performance in ROS 2 Slides Video
Papers
Distributed and Synchronized Setup towards Real-Time Robotic Control using ROS2 on Linux
Time Synchronization in modular collaborative robots
Open Problems in Robotic Anomaly Detection
Towards a distributed and real-time framework for robots: Evaluation of ROS 2.0 communications for real-time robotic applications
An information model for modular robots: the Hardware Robot Information Model (HRIM)
Introducting the Robot Security Framework (RSF), A standardized methodology to perform security assessments in robotics
Towards an open standard for assessing the severity of robot security vulnerabilities, The Robot Vulnerability Scoring System (RVSS)
Real-Time Characteristics of ROS 2.0 in Multiagent Robot Systems: An Empirical Study
Response-Time Analysis of ROS 2 Processing Chains Under Reservation-Based Scheduling
Robot Operating System 2 - The need for a holistic security approach to robotic architectures - Ubuntu 16.04, ROS 2 Beta 2/3, and RTI 5.3 DDS with DDS Security.
Maruyama, Yuya et al. “Exploring the performance of ROS2.” 2016 International Conference on Embedded Software (EMSOFT) (2016): 1-10.
Podcasts
ROS 2 and DDS for IoT devices with HaoChih Lin (from 5th minute onwards)
Everything about ROS 2 with Dirk Thomas (from 16th minute onwards)
Services
Cloud robotics
robolaunch
Robotics Capture the Flag (RCTF)
rctf-list - A list of Robotics CTF (RCTF) scenarios.
Companies
Acutronic Robotics - Not existing anymore. Initiators of the Hardware Robot Information Model (HRIM), Hardware Robot Operating System (H-ROS) and creators of the world's first modular industrial robot arm MARA.
ADLINK - "Leading EDGE COMPUTING".
Alias Robotics - Products and services in the context of robot cybersecurity.
Amazon - Robotics Team of Amazon Amazon Web Services (AWS).
Apex.AI - "Safe and certified software for autonomous mobility".
AutonomouStuff - "The world leader in autonomy systems and solutions".
Bosch - Robotics Team of Bosch Research.
Canonical - The company behind Ubuntu.
Eprosima - "The middleware experts".
Ericsson Research - Connect ROS2 applications to 5G networks for M2M communication.
FARobot - Swarm Robot System, a ROS 2/DDS based Fleet Management System.
Fraunhofer Institute for Manufacturing Engineering and Automation IPA - Robot and assistive systems.
GESTALT ROBOTICS - Service provider for intelligent automation.
Husarnet - Open Source, P2P, low-latency VPN dedicated for robots.
iRobot - Manufacturer of vacuuming and mopping robots.
Klepsydra Technologies.
MathWorks - ROS Toolbox.
Mission Robotics - Hardware and Software for a new era of Marine Intelligence.
Roboception GmbH - Real-Time Perception for Your Robot.
ROBOOX - OPEN-SOURCE SOFTWARE ECOSYSTEM FOR CONSUMER ROBOTS.
Rover Robotics - Rugged, industrial-grade robots.
Sony Corporation.
synapticon - ROS compatible motion control and drive products with efforts to support ROS2.
Wind River - ROS2 for VxWorks.
Organizations
U.S. Department of Transportation
Working Groups
Edge AI Working Group
Discourse threads tagged "wg-edgeai"
Embedded Working Group
Discourse threads tagged "wg-embedded"
Hardware Acceleration Working Group
Discourse threads tagged "wg-acceleration"
Navigation Working Group
Discourse threads tagged "wg-navigation"
Safety Working Group
Safety Working Group Landing Page
Safety Design Pattern Catalogue
Security Working Group
Discourse threads tagged "wg-security"
ros-security/community - Outlines the governance of the ROS 2 Security Working Group.
Technical Steering Committee
Discourse threads tagged "tsc"
Tooling Working Group
Discourse threads tagged "wg-tooling"
License
License: CC BY-NC-SA 4.0

About
The Robot Operating System Version 2.0 is awesome!

fkromer.github.io/awesome-ros2
Topics
awesome awesome-list ros2
Resources
 Readme
License
 View license
Code of conduct
 Code of conduct
Contributing
 Contributing
 Activity
Stars
 1.9k stars
Watchers
 81 watching
Forks
 310 forks
Report repository
Releases
No releases published
Packages
No packages published
Contributors
35
@omichel
@DominikN
@artivis
@cwyark
@cardboardcode
@szepilot
@kydos
@klintan
@spekulatius
@fkromer
@horverno
@adamdbrw
@betab0t
@enricosutera
+ 21 contributors
Footer
© 2025 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information

## https://github.com/lukicdarkoo/awesome-webots
Skip to content
Navigation Menu
Platform
Solutions
Resources
Open Source
Enterprise
Pricing

Search or jump to...
Sign in
Sign up
lukicdarkoo
/
awesome-webots
Public
Code
Issues
Pull requests
Actions
Projects
Security
Insights
lukicdarkoo/awesome-webots
Go to file
Name		
lukicdarkoo
lukicdarkoo
Update readme.md
2be1c61
 · 
3 years ago
assets
Add cover
5 years ago
.gitattributes
Initial commit
5 years ago
.yo-rc.json
Initial commit
5 years ago
code-of-conduct.md
Initial commit
5 years ago
contributing.md
Initial commit
5 years ago
readme.md
Update readme.md
3 years ago
Repository files navigation
README
Code of conduct
Contributing
Awesome Webots Awesome
Interesting projects, papers, books, demos and other resources related to Webots robot simulator.

Webots Cover

Webots is a free and open-source 3D robot simulator used in industry, education and research. It includes a large collection of freely modifiable models of robots, sensors, actuators and objects. The robot controller programs can be written outside of Webots in C, C++, Python, ROS, Java and MATLAB using a simple API. Webots can stream a simulation on web browsers using WebGL.

(source Wikipedia)

Contents
Installation
Tools and Libraries
Integrations
Tutorials
Community
Open Source Projects
Simulations
Papers
Books
Podcasts
Competitions
Related Awesome LIsts
Installation
Besides the official installation methods there are unofficial ones like AUR and Homebrew.

Official: Windows (standard Windows installer), Linux (snap package, Debian package, and tar.bz2 archive), and macOS (.dmg bundle).
Homebrew
AUR
Tools and Libraries
RobotBenchmark: Program simulated robots online. Compare your performance to the best. Share your achievements.
urdf2webots: Utility to convert URDF files to Webots PROTO nodes.
Robot Designer: Online tool that lets users build custom robots in an easy and quick way.
Webots for Visual Code: Webots-flavoured PROTO Syntax Highlighting Support in VSCode.
Webots for Atom: Webots-flavoured PROTO Syntax Highlighting Support in Atom.
Integrations
webots_ros2: Webots interface for ROS 2.
Deepbots: Webots interface for Open AI Gym.
SITL with Webots: Webots integration for ArduPilot.
Webots-Blockly: Webots integration for Blockly.
Webots Animation: Webots integration for GitHub Actions.
Tutorials
Tutorials on how to use Webots.

Webots Tutorial
Webots User Guide
Webots Reference Manual
Webots Documentation for Automobiles
Course "Introduction to Robotics" from Colorado
Course "Distributed Intelligent Systems" from EPFL
Video Tutorials
Tutorials by Soft illusion
[Turkish] Tutorials by harunlakodla
Community
Discord Channel
Webots Blog
Stack Overflow
Open Source Projects
List of open source projects that use Webots.

Eurobot Platform: Simulation of multiple robots with passive odometry, ROS 2, custom Navigation2 plugins, Behavior Trees, and more built around the Eurobot competition.
Deep Reinforcement Learning with PyTorch: This repository shows how Deep Reinforcement Learning can be used within Webots.
DJI Mavic 2 Pro PID Controller: Webots Simulation about controlling the UAV Quadrotor DJI Mavic 2 Pro using PID Controller in Python Programming.
Robot Positioning Estimation using ML Techniques: Machine Learning techniques together with non-parametric filters (such as Particles Filter) for robot positioning estimation.
Webots in Jupyter Lab: Run Webots streaming server in a Docker image with Jupyter Lab.
Micromouse in Webots: E-Puck robot solves a 16×16 maze using localization, mapping, path planning and motion control.
Simulations
List of simulations created with Webots.

Webots Boston Dynamics Spot
Webots DJI Mavic 2 PRO
Webots TIAGo++
Webots Autonomous Vehicle Simulation
Webots Universal Robots UR5e Simulation
AT-ST Inspired Walker
Papers
List of scientific papers related to Webots.

Webots: Professional Mobile Robot Simulation
Developing Khepera robot applications in a Webots environment
Aibo and Webots: Simulation, wireless remote control and controller transfer
Cooperative multi-agent mapping and exploration in Webots
Books
Books about Webots.

Webots: Symbiosis Between Virtual and Real Mobile Robots
Cyberbotics' Robot Curriculum
Podcasts
Using Webots Robot Simulator With ROS With Olivier Michel
Competitions
This is a list of recent competitions that utilize Webots. In case you plan to organize online competition you may find the list useful.

Student Robotics Competition (2020)
RoboCupJunior Rescue Simulation (2020)
Related Awesome Lists
Awesome Robotics
Awesome Robotics Libraries
Awesome ROS2
Awesome Computer Vision
Awesome Reinforcement Learning
Contribute
Contributions welcome! Read the contribution guidelines first.

License
CC0

To the extent possible under law, Darko Lukic has waived all copyright and related or neighboring rights to this work.

About
Awesome Webots

cyberbotics.com
Topics
machine-learning simulator robot ros ros2 webots
Resources
 Readme
Code of conduct
 Code of conduct
Contributing
 Contributing
 Activity
Stars
 95 stars
Watchers
 6 watching
Forks
 19 forks
Report repository
Releases
No releases published
Packages
No packages published
Footer
© 2025 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information

## https://github.com/mjyc/awesome-robotics-projects
Skip to content
Navigation Menu
Platform
Solutions
Resources
Open Source
Enterprise
Pricing

Search or jump to...
Sign in
Sign up
mjyc
/
awesome-robotics-projects
Public
Code
Issues
Pull requests
2
Actions
Projects
Security
Insights
mjyc/awesome-robotics-projects
Go to file
Name		
mjyc
mjyc
Update README.md
a790c31
 · 
3 days ago
LICENSE
Add LICENSE
6 years ago
README.md
Update README.md
3 days ago
Repository files navigation
README
CC0-1.0 license
Awesome Robotics Project
A list of open-source, affordable, less-known, or visionary robotics projects ... aaand robotics tooling companies I find interesting.

Animatronic Eye Mechanism - Animatronic Eye Mechanism from https://nmrobots.com/
ANYMal C - Autonomous four-legged robot
AWS DeepRacer - Autonomous 1/18th scale race car designed to test RL models
BCN3D - Open Source 3D Printed Robotic Arm for educational purposes
Berkeley Humanoid Lite - An Open-source, Accessible, and Customizable 3D-printed Humanoid Robot
BetaBot - 3d printable Robot arm
BiDexHand - BiDexHand: Open-Source 16-DoF Biomimetic Dexterous Hand
Bobble-Bot - Demonstration robot for learning principles of real-time control
CHAMP - 𓃡 CHAMP Quadruped Controller ROS Package
CyPhyHouse : a toolchain for distributed robotics - CyPhyHouse : a toolchain for distributed robotics
DG-5F - A robotic hand capable of human-level gripping and manipulation
Dobb-E - Open-source, general framework for learning household robotic manipulation
DUMMY - The Robot Arm Is Not So Dumb
ExoMy - The 3D printed rover developed by the European Space Agency
Forte - Strong, Accurate, and Low-Cost Robot Manipulator
GoodBoy - 3D Printed Arduino Robot Dog
JPL Open Source Rover Project - Open-source 6-wheel rover based on the rovers on Mars
Just1 - How I built a small autonomous robot ...
K-Bot - The K-Scale Robot
LeRobot - State-of-the-art AI for real-world robotics
LHF connect - A small semi-autonomous device that connects patients in isolation with the people they love
Linorobot - Suite of low-cost open-source mobile robots
MABEL A Boston Dynamics inspired balancing robot
Magni - Affordable robotic mobile base with 100kg payload
MuSHR - Affordable, open-source robotic race car
NanoSaur - NVIDIA Jetson dinosaur robot, fully 3D printable, ROS2 competible
Nguyen Vincent's omnidirectional ROS2 robot - Making an omnidirectional ROS2 robot. No talking, no music. Just building.
Niryo One - 3D printed 6 axis robotic arm
NVIDIA ISSAC PLATFORM - Robotic AI Development Platform with Simulation, Navigation and Manipulation
Nybble - Open-source robotic cat
Open Dynamic Robot Initiative - An Open Torque-Controlled Modular Robot Architecture for Legged Locomotion Research
Open-Source Robotic Arm - Open-source robotic arm using PC with ROS, STM32, and CAN bus
OpenBot - Turning Smartphones into Robots
Openmanipulator - Open-software/hardware/embedded-board robotic arm
Open Duck Mini v2 - Making a mini version of the BDX droid. https://discord.gg/UtJZsgfQGe
OpenPodcar - Open source hardware design and software for OpenPodcar.
OpenΒionics - Open-source initiative for the development of robotic and bionic devices
Poppy Project - Open-source platform for interactive 3D printed robots
PyRobot - Python package for running experiments in robot learning
PythonRobotics - Python sample codes for robotics algorithms
Reachy 2 – Open-source humanoid robot
ROBEL - Collection of affordable, reliable hardware robot designs
RoboArm - robot arm
RoboPrime - Full featured 21 DOF 3D Printed Humanoid Robot based on ATmega328P chip
Robotics Middleware Framework - Task queuing, conflict-free resource scheduling, utilities to help create robot fleet adapters, and so on
ROSbot 2.0 - Open source mobile robot platform
RUKA - Rethinking the Design of Humanoid Hands with Learning
Stanford Doggo - Open-source quadruped robot
Thor - DIY 3D printable robotic arm
TriFinger - An Open-Source Robot for Learning Dexterity
TurtleBot - Low-cost, personal robot kit with open-source software
UMIRobot - A simple 3D printable robot arm with open-source hardware and software.
Vine Robots - Soft continuum robots design with low-cost fabrication in mind and for the navigation of difficult environments.
Walter - 6DOF Industrial Robot, vintage style
Library, Framework, SDK
Robots
boston-dynamics/spot-sdk - Spot SDK
copper-project/copper-rs - Robot SDK in Rust (deterministic and high performance)
facebookresearch/home-robot - Mobile manipulation research tools for roboticists
facebookresearch/pyrobot PyRobot: An Open Source Robotics Research Platform
resibots/minitaur_sdk - Minitaur SDK extension
robotemi/sdk - temi SDK
Anki Cozmo Python SDK, C# SDK, and PyCozmo
unitreerobotics/unitree_sdk2 - Unitree robot sdk version 2
Autonomous Driving
ApolloAuto/apollo - An open autonomous driving platform
autowarefoundation/autoware.universe - Open-source software for self-driving vehicles
commaai/openpilot - openpilot is an open source driver assistance system.
ML & Vision
any4lerobot - A collection of utilities and tools for LeRobot
borglab/gtsam - Georgia Tech Smoothing and Mapping Library
facebookresearch/theseus - A library for differentiable nonlinear optimization
KFCore - A lightweight, high-performance Kalman Filter library in C, C++, and MATLAB
nano-pgo - For an education purpose, from-scratch, single-file, python-only pose-graph optimization implementation
openMVG/openMVG - open Multiple View Geometry library. Basis for 3D computer vision and Structure from Motion.
CRISP - Compliant ROS2 Controllers for Learning-Based Manipulation Policies
Command Line Tools
linux_isolate_process
ros command - Unifying the ROS command line tools
ROSA - The ROS Agent
ROSBoard - ROS node that runs a web server on your robot.
Pixi: Modern package management for Robotics
TermViz - ROS visualization on the terminal
Data Visualization & UI
A-FRAME - A web framework for building 3D/AR/VR experiences
AR.js - Augmented Reality on the Web
CloudPeek - Lightweight, cross-platform, single-header C++ point cloud viewer
Lanelet2 - C++ library for handling map data in the context of automated driving
Realtime robot data visualization in the browser
rerun.io - Open source visualization infrastructure for computer vision and robotics
ROS Reality - Connect a ROS-enabled robot to Unity
ros2_bag_exporter - ROS2 Bag Exporter is a ROS 2 c++ package designed to export ROS 2 bag files (rosbag2) into various formats
rosetta — ROS 2 ⇄ LeRobot bridge - Standardizes the interface between ROS 2 topics and LeRobot policies using a small YAML contract
URDFormer - code release for URDFormer
web-based visualization libraries
Simulators
that are physically accurate, photo realistic, or roboticist friendly.

AI Habitat - AI Habitat enables training of embodied AI agents in a highly photorealistic & efficient 3D simulator
CARLA - Open-source simulator for autonomous driving research
Flightmare - A Flexible Quadrotor Simulator
Gazebo - Gazebo is an open-source 3D robotics simulator
Gibson - Gibson is a perceptual and physics Simulator
LIBERO - Benchmarking Knowledge Transfer in Lifelong Robot Learning
MetaDrive - Open-source Driving Simulator for AI and Autonomy Research
MORSE - The open-source simulator for academic robotics
NVIDIA Isaac Sim - Simulate, test and iterate virtual robots in a high fidelity 3D environment
OmniGibson - A platform for accelerating Embodied AI research built upon NVIDIA's Omniverse engine
Open 3D Engine (O3DE) - An Apache 2.0-licensed multi-platform 3D engine that enables developers and content creators to build AAA games, cinema-quality 3D worlds, and high-fidelity simulations without any fees or commercial obligations.
Project dave - A simulation environment to support the rapid testing and evaluation of underwater robotic solutions
SimplerEnv - Simulated Manipulation Policy Evaluation Environments for Real Robot Setups
Unity Robotics Hub - Central repository for tools, tutorials, resources, and documentation for robotics simulation in Unity
Webots - Open source robot simulator
ZeroSimROSUnity - Robotic simulation in Unity with ROS integration
Dataset
nvidia/PhysicalAI-Autonomous-Vehicles PhysicalAI Autonomous Vehicles
YCB Benchmarks – Object and Model Set YCB Benchmarks – Object and Model Set
Deployment
ROS Kubernetes / KubeEdge - Kuberenetes / ROS&ROS2 Cluster Samples
Hardware Communities
adafruit - "Adafruit designs, manufactures and sells a number of electronics products, electronics components, tools and accessories."
hackaday and hackaday.io - "Hackaday.io is the world's largest collaborative hardware development community."
hackster.io - "Hackster is a community dedicated to learning hardware, from beginner to pro."
instructables - "Instructables is a community for people who like to make things."
Conferences & Events
Amazon re:MARS - Global AI event for Machine Learning, Automation, Robotics, and Space
BARS - Bay Area Robotics Symposium
BazelCon - The premier annual event to strengthen and unify the Bazel Community
COMMA_CON - IRL event full of technical talks from comma's openpilot, research, infrastructure, and hardware teams
CppCon - The annual, week-long face-to-face gathering for the entire C++ community
MODEX - The Premier Supply Chain Event
Robotics Summit & Expo - The International Design and Development Event for Robotics and Intelligent Systems
ROSCon - The robotics conference for developers
TEROS - Texas Regional Robotics Symposium
Newsletter
Evan Ackerman's Twitter feed
IEEE SPECTRUM - Robotics
The Robot Report
The Verge - Robot
Weekly Robotics
TechCrunch: Robotics category, robotics tag
Bloggers
https://engmanage.substack.com/
https://generalrobots.substack.com/
https://geohot.github.io/blog/
https://itcanthink.substack.com/
https://medium.com/@elliotgraebert
https://mjyc.github.io/blog/
https://mtmason.com/matt-mason-robotics-blog/
https://ranchhandrobotics.com/
https://roboticseabass.com/about/
https://rodneybrooks.com/blog/
https://sergeylevine.substack.com/
Robotics Tooling Companies
Airbotics - Open-source software deployment platform for robotics
Applied Intuition - ADAS and AV simulation and development tools
Artificial - Redefining Lab Automation Software
Autoware.AI - the world's first "All-in-One" open-source software for autonomous driving technology
AWS RoboMaker - Simulate and deploy robotic applications at cloud scale
cogniteam - Standout software solutions for autonomous robots
Ekumen - We are an international engineering boutique, provider of advanced software development services and technology
FogROS2 - a framework that allows existing ROS 2 automation applications to gain access to additional computing resources from commercial cloud-based services
FogROS - a framework that allows existing ROS automation applications to gain access to additional computing resources from commercial cloud-based services (deprecated)
Formant - Speak Robot; Intelligent platform for robotic fleets
Freedom robotics - POWERFUL CONTROL AND MONITORING FOR ROBOTS
Generalist
Honu Robotics - Expert partners for your next innovation
InOrbit - MISSION CONTROL for AUTONOMOUS ROBOTS
KABAM Robotics - WORK MANAGEMENT SYSTEM FOR ALL YOUR ROBOTS & SMART DEVICES
Lightwheel-Platform Enterprise - Make Simulation Successful
micropsi industries - Automate Manual Workstations Yourself
miru - Configuration Management for Robotics
Nema - AI agents that accelerate robotics hardware design
Open Navigation LLC - Your Friendly Neighborhood Navigators
PHANTOM AI - Democratizing advanced driver assistance systems
Physical Intelligence (π)
Rapyuta Robotics - We make robots attainable and useful
rethink robotics - Rethink Robotics Meets German Engineering
Roboto - Curating the world's robotics data
ROS Development Studio - Develop your ROS project from a single place online
ROSbloX - Your ultimate building blocks for rapidly creating a robot's software stack.
RosHub - Manage one robot or entire fleets
scale - The Data Platform for AI
SEMIO - bringing robots to life
SLAMCore - Spatial Intelligence for robots and machines
SOUTHIE AUTONOMY - Easy, Flexible Automation for Contract Packaging
TANGRAM - The Modern Perception Platform
Transitive Robotics - Open-core, Full-stack Robotic Software Capabilities
Vinci - Powering the future of hardware design
Windows 10 IoT + ROS - Bringing the intelligent edge to robots with ROS on Windows 10 and Azure
YOU ONLY NEED ONE HUB - Cloud-based system for designing, sharing, and evaluating Autonomous Vehicles, ADAS, and Robotics.
Deployment & DevEnv
but not robotics-specific

balena - The infrastructure you need to develop, deploy, and manage fleets of connected devices at scale
MENDER - Over-the-Air Software Updates for IoT Devices
Synpse - Deploy. Monitor. Manage.
aviator - Keep builds green with a highly customizable merge queue
DevZero - More time writing code.
Miru - Deployment Infrastructure for Robotics and IoT
Related Awesome Lists
Awesome HRI Datasets and Human Simulators
Awesome Human Robot Interaction
Awesome Projects
Awesome Robot Operating System 2 (ROS 2)
Awesome Robotic Tooling
Awesome Robotics Conferences and Schools (torydebra)
Awesome Robotics Libraries
Awesome Robotics (ahundt)
Awesome Robotics (Kiloreux)
Awesome Weekly Robotics
awesome-cloud-robotics
Shameless Self-Advertisement
(Wannabe) Awesome (Remote) Robot DevEnvs
Awesome HRI Datasets and Human Simulators
Awesome HRI Papers for Industry
Awesome Robotics System Design (and more)
awesome-behavioral-change
awesome-end-user-programming
awesome-tech-education
My curated list of robotics companies (Google Sheet)
License
CC0

About
A list of open-source, affordable, less-known, or visionary robotics projects.

Topics
awesome robotics projects
Resources
 Readme
License
 CC0-1.0 license
 Activity
Stars
 1.2k stars
Watchers
 32 watching
Forks
 139 forks
Report repository
Releases
No releases published
Packages
No packages published
Contributors
5
@mjyc
@gbin
@asowani
@nedlowe
@Tavish9
Footer
© 2025 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information


## https://en.wikipedia.org/wiki/Robotics_simulator


WikipediaThe Free Encyclopedia
Search Wikipedia
Search
Donate
Create account
Log in
Banner logo	
Join Wikipedia Asian Month this November and December!
Contribute in Wikipedia Asian Month and get a postcard!

[Help with translations!]Hide
Contents hide
(Top)
Features
Simulators

General information
Technical information
Infrastructure
Support
Code quality
Features
Robot families
Supported actuators
Supported sensors
References
Robotics simulator

Article
Talk
Read
Edit
View history

Tools
Appearance hide
Text

Small

Standard

Large
Width

Standard

Wide
Color (beta)

Automatic

Light

Dark
From Wikipedia, the free encyclopedia

This article possibly contains original research. Please improve it by verifying the claims made and adding inline citations. Statements consisting only of original research should be removed. (August 2014) (Learn how and when to remove this message)
A robotics simulator is a simulator used to create an application for a physical robot without depending on the physical machine, thus saving cost and time. In some case, such applications can be transferred onto a physical robot (or rebuilt) without modification.

The term robotics simulator can refer to several different robotics simulation applications. For example, in mobile robotics applications, behavior-based robotics simulators allow users to create simple worlds of rigid objects and light sources and to program robots to interact with these worlds. Behavior-based simulation allows for actions that are more biotic in nature when compared to simulators that are more binary, or computational. Also, behavior-based simulators may learn from mistakes and can demonstrate the anthropomorphic quality of tenacity.


Robologix robotics simulator
One of the most popular applications for robotics simulators is for 3D modeling and rendering of a robot and its environment. This type of robotics software has a simulator that is a virtual robot, which can emulate the motion of a physical robot in a real work envelope. Some robotics simulators use a physics engine for more realistic motion generation of the robot. The use of a robotics simulator to develop a robotics control program is highly recommended regardless of whether a physical robot is available or not. The simulator allows for robotics programs to be conveniently written and debugged off-line with the final version of the program tested on a physical robot. This applies mainly to industrial robotic applications, since the success of off-line programming depends on how similar the physical environment of a robot is to a simulated environment.

Sensor-based robot actions are much more difficult to simulate and/or to program off-line, since the robot motion depends on instantaneous sensor readings in the real world.

Features
Modern simulators tend to provide the following features:

Fast robot prototyping:
Using the own simulator as creation tool
Using external tools
Physics engines for realistic movements: Most simulators use Bullet, ODE or PhysX.
Realistic 3d rendering: Standard 3d modeling tools or third-party tools can be used to build the environments.
Dynamic robot bodies with scripting: C, C++, Perl, Python, Java, URBI, and MATLAB languages used by Webots; C++ used by Gazebo.
Simulators
Among the newest technologies available today for programming are those which use a virtual simulation. Simulations with the use of virtual models of the working environment and the robots themselves can offer advantages to both the company and programmer. By using a simulation, costs are reduced, and robots can be programmed off-line which eliminates any down-time for an assembly line. Robot actions and assembly parts can be visualized in a three-dimensional virtual environment months before prototypes are even produced. Writing code for a simulation is also easier than writing code for a physical robot. While the move toward virtual simulations for programming robots is a step forward in user interface design, many such applications are only in their infancy.

General information
Software	Developers	Development status	License	3D rendering engine	Physics engine	3D modeller	Platforms supported
Gazebo	Open Source Robotics Foundation (OSRF)	Active	Apache 2.0	OGRE	ODE, Bullet, Simbody, DART	Internal	Linux, macOS, Windows
RoboDK	RoboDK	Active	Proprietary	OpenGL	Gravity plug-in	Internal	Linux, macOS, Windows, Android, iOS, Debian
SimSpark	O. Obst et al. (+26)	Active	GNU GPL (v2)	Internal	ODE	None	Linux, macOS, Windows
Webots	Cyberbotics Ltd.	Active	Apache 2.0	Internal (WREN)	Fork of ODE	Internal	Linux, macOS, Windows
OpenRAVE	OpenRAVE Community	Active	GNU LGPL	Coin3D, OpenSceneGraph	ODE, Bullet	Internal	Linux, macOS, Windows
CoppeliaSim	Coppelia Robotics	Active	Dual: commercial, GNU GPL	Internal	MuJoCo, Bullet, ODE, Vortex, Newton	Internal	Linux, macOS, Windows
Software	Developers	Development status	License	3D rendering engine	Physics engine	3D modeller	Platforms supported
Technical information
Software	Main programming language	Formats support	Extensibility	External APIs	Robotics middleware support	Primary user interface	Headless simulation
Gazebo	C++	SDF[1]/URDF,[2] OBJ, STL, COLLADA	Plug-ins (C++)	C++	ROS, Player, sockets (protobuf messages)	GUI	Yes
RoboDK	Python	SLDPRT, SLDASM, STEP, OBJ, STL, 3DS, COLLADA, VRML, Robot Operating System URDF, Rhinoceros 3D, ...	API,[3] Plug-In Interface[4]	Python, C/C++, C#, Matlab, ...	Socket	GUI	Yes
SimSpark	C++, Ruby	Ruby Scene Graphs	Mods (C++)	Network (sexpr)	Sockets (sexpr)	GUI, sockets	Unknown
Webots	C++	WBT, VRML, X3D, 3DS, Blender, BVH, COLLADA, FBX, STL, OBJ, URDF	API, PROTOs, plug-ins (C/C++)	C, C++, Python, Java, Matlab, ROS	Sockets, ROS, NaoQI	GUI	Yes[5]
OpenRAVE	C++, Python	XML, VRML, OBJ, COLLADA	Plug-ins (C++), API	C/C++, Python, Matlab	Sockets, ROS, YARP	GUI, sockets	Yes
CoppeliaSim	C++, Python, Lua	3DS, Blender, COLLADA, STL, OBJ, URDF, SDF, GLTF, XML	Plug-ins (C/C++), embedded scripts (Python, Lua), remote API (C, C++, Python, Java, MATLAB, Octave), add-ons (Python, Lua)	C, C++, Python, Java, MATLAB, Octave, ROS, ROS 2.0	Sockets, ROS, ROS 2.0, ZeroMQ	GUI	Yes
Software	Main programming language	Formats support	Extensibility	External APIs	Robotic middleware support	Primary user interface	Headless simulation
Infrastructure
Support
Software	Mailing list	API documentation	Public forum, help system	User manual	Issue tracker	Wiki	Chat
Gazebo	Yes[6]	Yes[7]	Yes[8]	Yes[9]	Yes[10]	No
RoboDK	Yes[11]	Yes[12]	Yes[13]	Yes[14]	Yes[15]	No	Unknown
SimSpark	Yes[16]	Yes[17]	No	Yes[18]	Yes[19]	Yes[20]	Unknown
Webots	No	Yes[21]	Yes[22]	Yes[23]	Yes[24]	Yes[25]	Yes[26]
OpenRAVE	Yes[27]	Yes[28]	Yes[29]	Yes[30]	Yes[29]	Yes[31]	Unknown
CoppeliaSim	No	Yes[32]	Yes[33]	Yes[34]	Yes[35]	Unknown	No
Software	Mailing list	API documentation	Public forum, help system	User manual	Issue tracker	Wiki
Code quality
Software	Static code checker	Style checker	Test system(s)	Test function coverage	Test branch coverage	Lines of code	Lines of comments	Continuous integration
Gazebo	cppcheck[36]	cpplint[36]	gtest and qtest[36]	77.0%[36]	53.3%[36]	320k[36]	106k[36]	Jenkins[36]
RoboDK	Unknown	Unknown	Unknown	Unknown	Unknown	Unknown	Unknown	Unknown
SimSpark	Unknown	Unknown	Unknown	Unknown	Unknown	Unknown	Unknown	Unknown
Webots	cppcheck[37]	clang-format[38]	unit tests[39]	100% of API functions[40]	master,[41] develop[42]	~200k	~50k	GitHub Actions
OpenRAVE	Unknown	Unknown	Python nose	Unknown	Unknown	Unknown	Unknown	Jenkins[43]
CoppeliaSim	Unknown	Unknown	Unknown	Unknown	Unknown	Unknown	Unknown	Unknown
Software	Static code checker	Style checker	Test system(s)	Test function coverage	Test branch coverage	Lines of code	Lines of comments	Continuous integration
Features
Software	CAD to motion	Dynamic collision avoidance	Relative end effectors	Off-line programming	Real-time streaming control of hardware
Gazebo	Unknown	Yes	Yes	Yes	Yes
RoboDK	Yes	Yes	Yes	Yes	Yes
SimSpark	Unknown	No	Unknown	No	No
Webots	Unknown	Yes	Yes	Yes	Yes
OpenRAVE	Unknown	No	Unknown	No	No
CoppeliaSim	Unknown	Yes	Yes	Yes	Yes
Software	CAD to motion	Dynamic collision avoidance	Relative end effectors	Off-line programming	Real-time streaming control
Robot families
Software	UGV (ground mobile robot)	UAV (aerial robots)	AUV (underwater robots)	Robotic arms	Robotic hands (grasping simulation)	Humanoid robots	Human avatars	Full list
Gazebo	Yes[44]	Yes[45]	Yes[46]	Yes[47]	Yes[48]	Yes[49]	Yes[50]	
RoboDK	No	No	No	Yes[51]	No	No	No	Yes[51]
SimSpark	Yes	No	No	Maybe	Maybe	Yes	No	
Webots	Yes	Yes	Yes[52]	Yes	Yes	Yes[53]	Yes	Yes[54]
OpenRAVE	Yes	Unknown	Unknown	Yes	Yes	Yes	Yes
CoppeliaSim	Yes	Yes	Yes	Yes	Yes	Yes	Yes	Yes[55]
Software	UGV (ground mobile robot)	UAV (aerial robots)	AUV (underwater robots)	Robotic arms	Robotic hands (grasping simulation)	Humanoid robots	Human avatars	Full list
Supported actuators
Software	Generic kinematic chains	Force-controlled motion	Full list	Circular kinematic chains	Kinematically redundant chains	Bifurcated kinematic chains
Gazebo	Yes	Yes		Yes	Yes	Yes
RoboDK	Unknown	Unknown		Unknown	Unknown	Unknown
SimSpark	Yes	No	SimSpark effectors	Unknown	Unknown	Unknown
Webots	Yes	Yes	Webots actuators	Yes	Yes	Yes
OpenRAVE	Yes	Yes	Joints,Extra Actuators	Yes[56]	Yes	Yes[57]
CoppeliaSim	Yes	Yes		Yes	Yes	Yes
Software	Generic kinematic chains	Force-controlled motion	Full list	Circular kinematic chains	Kinematically redundant chains	Bifurcated kinematic chains
Supported sensors
Software	Odometry	IMU	Collision	GPS	Monocular cameras	Stereo cameras	Depth cameras	Omnidirectional cameras	2D laser scanners	3D laser scanners	Full list
Gazebo	Yes	Yes	Yes[58]	Yes	Yes[59]	Yes	Yes	Yes	Yes[60]	Yes[60]	
RoboDK	Unknown	Unknown	Unknown	Unknown	Unknown	Yes	Yes	Yes	Yes	Yes	
SimSpark	Yes	Yes	Yes[61]	Partial[62]	Yes	Partial	Unknown	Unknown	No	No	SimSpark perceptors
Webots	Yes	Yes	Yes	Yes	Yes	Yes	Yes	Yes	Yes	Yes	Webots sensors
OpenRAVE	Yes	Yes	Yes	Yes	Yes	Yes	Yes	Unknown	Yes	Yes
CoppeliaSim	Yes	Yes	Yes	Yes	Yes	Yes	Yes	Yes	Yes	Yes
Software	Odometry	IMU	Collision	GPS	Monocular cameras	Stereo cameras	Depth cameras	Omnidirectional cameras	2D laser scanners	3D laser scanners	Full list
References
 OSRF. "SDF". sdformat.org. Retrieved 2019-04-27.
 "urdf - ROS Wiki". wiki.ros.org. Retrieved 2017-10-06.
 "RoboDK API". GitHub. 22 October 2021.
 "RoboDK Plug-In Interface". GitHub. 16 October 2021.
 However, requires a connection on an X server for 3D rendering
 "Gazebo Community". Retrieved 2019-04-27.
 "Gazebo API". Gazebo Community. Retrieved 2019-04-27.
 "Gazebo Answers". Gazebo Community. Retrieved 2019-04-27.
 "Gazebo Tutorials". Gazebo Community. Retrieved 2019-04-27.
 "Gazebo Issue Tracker". Gazebo Community. Retrieved 2019-04-27.
 RoboDK mailing list
 RoboDK API Documentation
 RoboDK Forum
 RoboDK Documentation
 RoboDK Bug tracker
 SimSpark mailing lists
 "SimSpark client protocols". Archived from the original on 2016-02-25. Retrieved 2015-04-08.
 "SimSpark user manual (Wiki)". Archived from the original on 2015-02-25. Retrieved 2015-04-08.
 SimSpark Tracker
 SimSpark Wiki[permanent dead link]
 Webots Reference Manual
 "Discussions · cyberbotics/Webots". GitHub.
 Webots User Guide
 Webots issues on GitHub
 Webots technical wiki on GitHub
 Webots Discord channel
 OpenRAVE mailing list
 OpenRAVE API
 OpenRAVE Issue Tracker
 OpenRAVE User Guide
 OpenRAVE Wiki
 CoppeliaSim API
 Coppelia Robotics Forum
 CoppeliaSim User Manual
 Coppelia Robotics bug reports
 OSRF. "Gazebo". gazebosim.org. Retrieved 2019-04-27.
 CppCheck
 Clang Format
 Unit tests
 API tests
 Webots master
 Webots develop
 Source
 OSRF. "Gazebo : Tutorial : Beginner: Model Editor". gazebosim.org. Retrieved 2019-04-27.
 OSRF. "Gazebo : Tutorial : Aerodynamics". gazebosim.org. Retrieved 2019-04-27.
 OSRF. "Gazebo : Tutorial : Hydrodynamics". gazebosim.org. Retrieved 2019-04-27.
 OSRF. "Gazebo : ARIAC". gazebosim.org. Retrieved 2019-04-27.
 OSRF. "Gazebo : HAPTIX". gazebosim.org. Retrieved 2019-04-27.
 "DARPA's legacy: Open source simulation for robotics development and testing". Robohub.org. Retrieved 2019-04-27.
 OSRF. "Gazebo : Tutorial : Make an animated model (actor)". gazebosim.org. Retrieved 2019-04-27.
 RoboDK robot library
 including Salamander robot
 including Nao, DARwIn-OP, Fujitsu HOAP2, Kondo KHR-2HV, KHR-3, etc.
 Webots robot models
 CoppeliaSim main features
 OpenRAVE Closed chains
 OpenRAVE Dual-arm example
 OSRF. "Gazebo : Tutorial : Contact Sensor". gazebosim.org. Retrieved 2019-04-27.
 OSRF. "Gazebo : Tutorial : Camera Distortion". gazebosim.org. Retrieved 2019-04-27.
 OSRF. "Gazebo : Tutorial : Intermediate: Velodyne". gazebosim.org. Retrieved 2019-04-27.
 Collision detection uses a simplified model
 Possible, no model for noise
vte
Robotics
Main articles	
OutlineGlossaryIndexHistoryGeographyHall of FameEthicsLawsCompetitionsAI competitions

Types	
AerobotAnthropomorphic HumanoidAndroidCyborgGynoidClaytronicsCompanionAutomaton Animatronic Audio-AnimatronicsIndustrialArticulated armDomesticEducationalEntertainmentJugglingMilitaryMedicalServiceDisabilityAgriculturalFood serviceRetailBEAM roboticsSoft robotics
Classifications	
BioroboticsCloud roboticsContinuum robotUnmanned vehicle aerialgroundMobile robotMicroboticsNanoroboticsNecroboticsRobotic spacecraft Space probeSwarmTeleroboticsUnderwater remotely-operatedRobotic fish
Locomotion	
TracksWalking HexapodClimbingElectric unicycleRobotic fins
Navigation and mapping	
Motion planningSimultaneous localization and mappingVisual odometryVision-guided robot systems
Research	
EvolutionaryKitsSimulatorSuiteOpen-sourceSoftwareAdaptableDevelopmentalHuman–robot interactionParadigmsPerceptualSituatedUbiquitous
Companies	
ABBAmazon RoboticsAnybotsBarrett TechnologyBoston DynamicsDoosan RoboticsEnergid TechnologiesFarmWiseFANUCFigure AIFoster-MillerHarvest AutomationHD Hyundai RoboticsHoneybee RoboticsIntuitive SurgicalIRobotKUKARainbow RoboticsStarship TechnologiesSymboticUniversal RoboticsWolf RoboticsYaskawa
Related	
Critique of workPowered exoskeletonWorkplace robotics safety Robotic tech vestTechnological unemploymentTerrainabilityFictional robots
 Category Outline
Category: Robotics suites
This page was last edited on 11 August 2025, at 03:08 (UTC).
Text is available under the Creative Commons Attribution-ShareAlike 4.0 License; additional terms may apply. By using this site, you agree to the Terms of Use and Privacy Policy. Wikipedia® is a registered trademark of the Wikimedia Foundation, Inc., a non-profit organization.
Privacy policyAbout WikipediaDisclaimersContact WikipediaCode of ConductDevelopersStatisticsCookie statementMobile view
Wikimedia Foundation
Powered by MediaWiki

